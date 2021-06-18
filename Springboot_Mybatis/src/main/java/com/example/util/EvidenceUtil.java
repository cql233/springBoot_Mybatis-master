package com.example.util;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.example.common.entity.SelfBean;
import com.example.onepay.service.OnepayAccessHistoryService;
import com.example.onepay.service.OnepayOrderFlowService;
import com.example.paytree.entity.BaseBean;
import com.example.paytree.entity.OrderDetail;
import com.example.paytree.service.PaytreeAccessHistoryService;
import com.example.paytree.service.PaytreeOrderDetailService;
import com.example.paytree.service.PaytreeOrderMainService;
import javax.validation.constraints.NotBlank;

import static com.example.util.PointsToCsvFile.PointsToCsvFile;

/**
 * 〈辅助获取证迹的自制工具〉
 *
 * @author cql
 * @create 2020/12/30
 * @since 1.0.0
 */
public  class EvidenceUtil {
    /**
     * 获取文件生成的路径 、和表的key
     * @param urls
     * @param path
     * @return
     */
    public static void createCSVFile(JSONObject jsonObject, String [] urls, String path, String  differentiate){
        SelfBean info=new SelfBean();
        //如果传参不对 不生成文件
        if(jsonObject==null||urls==null||urls.length<=0||StringUtils.isEmpty(path)){
            return ;
        }
        PaytreeAccessHistoryService paytreeAccessHistoryService=(PaytreeAccessHistoryService) SpringContextHolder.getBean("paytreeAccessHistoryService");
        boolean is_paytree=true;
        Map accessHistoryParameterMap=new HashMap();
        accessHistoryParameterMap=getAccessHistoryParameterMap(urls);

        is_paytree=paytreeAccessHistoryService.isPaytree(accessHistoryParameterMap);

        List<BaseBean> detailsList=new ArrayList<>();
        List<BaseBean> orderMains=new ArrayList<>();
        List<BaseBean> accessHistorylists=new ArrayList<>();
        List<BaseBean> orderFlowLists=new ArrayList<>();
        String orderId="";
        String accessId="";
        String logicType= getLogicType(urls);
        String filePath=getFilePath(urls,path,differentiate);
        //accessHIsotry 获取
        if(isCreateAccessHistoryFile(filePath)){
                if(is_paytree){
                    accessHistorylists=paytreeAccessHistoryService.getList(accessHistoryParameterMap);
                }else {
                    OnepayAccessHistoryService onepayAccessHistoryService=(OnepayAccessHistoryService)SpringContextHolder.getBean("onepayAccessHistoryService");
                    accessHistorylists=onepayAccessHistoryService.getList(accessHistoryParameterMap);
                }
                PointsToCsvFile(accessHistorylists,filePath);
        }
        //orderdetail 表获取
        //获取参数
        Map orderDetailParameterMap=new HashMap();
        orderDetailParameterMap=getOrderDetailParameterMap(jsonObject,differentiate,urls);
        if(isCreateOrderDetailFile(filePath,is_paytree)) {
            PaytreeOrderDetailService paytreeOrderDetailService=(PaytreeOrderDetailService)SpringContextHolder.getBean("paytreeOrderDetailService") ;
            detailsList=paytreeOrderDetailService.getOrderDetailList(orderDetailParameterMap);
            PointsToCsvFile(detailsList, filePath);
            PaytreeOrderMainService paytreeOrderMainService=(PaytreeOrderMainService)SpringContextHolder.getBean("paytreeOrderMainService");
            if(detailsList.size()>0){
                //orderMian表获取
                orderId=((OrderDetail)detailsList.get(0)).getOrderId();
                orderMains=paytreeOrderMainService.getOrderMain(orderId);
                PointsToCsvFile(orderMains, filePath);
            }
            //onepay的orderflow表
        }else if(isCreateOrderFlowFile(filePath,is_paytree)){
            OnepayOrderFlowService onepayOrderFlowService=(OnepayOrderFlowService)SpringContextHolder.getBean("onepayOrderFlowService");
            orderFlowLists=onepayOrderFlowService.getList(orderDetailParameterMap);
            PointsToCsvFile(orderFlowLists, filePath);
        }

    }
    public static  String getLogicType(String[] url){
        if(url==null||url.length<=0){
            return "";
        }
        String var="";
        for(int i=0;i<url.length;i++){
            if(url[i].contains("onfirm")){
                var="Confirm";break;
            }else if(url[i].contains("efund")){
                var="Refund";break;
            }else if(url[i].contains("everse")){
                var="Reverse";break;
            }else if(url[i].contains("pay")||url[i].contains("Pay")){
                var="Pay";break;
            }else if(url[i].contains("qcPay")) {
                var ="TqcPay";break;
            }else if(url[i].contains("rderDetailQuery")){
                var="OrderDetailQuery";break;
            }else if(url[i].contains("rderQuery")){
                var="OrderQuery";break;
            }else if(url[i].contains("deposit")){
                var="Deposit";break;
            }else {
              //  return "";
            }
        }
        return var;
    }

    /**
     * 获取access 表数据的参数组装
     */
    public static  Map getAccessHistoryParameterMap(String[] urls){
        LocalDate now =LocalDate.now();
        String createTime=""+ now.getYear()+"-"+now.getMonthValue()+"-"+now.getDayOfMonth()+" 00:00:00";
        String token=urls[urls.length - 1];
        Map<String,String> map=new HashMap();
        map.put("token",token);
        map.put("createTime",createTime);
        return map;
    }
    /**
     * 获取order_detail表的参数组装
     */
    public static  Map getOrderDetailParameterMap(JSONObject jsonObject,String differentiate,String[] urls){
        Map<String,String> mapOrder=new HashMap();
        JSONObject requestBody= jsonObject.getJSONObject("requestBody");
        if(StringUtils.isEmpty(requestBody.getString("orderId"))){
            if(!StringUtils.isEmpty(requestBody.getString("orderDetailId"))){
                mapOrder.put("detailId",requestBody.getString("orderDetailId"));
            }
            if(!StringUtils.isEmpty(requestBody.getString("transSerial"))){
                mapOrder.put("detailId",requestBody.getString("transSerial"));
            }
        }
        mapOrder.put("token",requestBody.getString("qryToken"));
        mapOrder.put("orderId",requestBody.getString("orderId"));
        if(!differentiate.contains("before")&& !differentiate.contains("after")){
            mapOrder.put("token",urls[urls.length - 1]);
        }
        return mapOrder;
    }

    /**
     * 获取文件的路径
     */
    public static  String getFilePath(String [] urls, String path, String  differentiate){
        String logicType= getLogicType(urls);
        String var="";
        if(differentiate.contains("before")){
            var=path+( File.separator+logicType+File.separator+"before");
        }else if(differentiate.contains("after")){
            var=path+( File.separator+logicType+File.separator+"after");
        }else {//支付的情况
            var=path+ File.separator+logicType;
        }
        return var;
    }
    /**
     * 文件生成的flag
     */
    public static boolean isCreateAccessHistoryFile(@NotBlank String path) {
        return path.contains("after")||path.contains("deposit")||path.contains("ay")||path.contains("uery")?true:false;
    }
    public static boolean isCreateOrderDetailFile(@NotBlank String path,boolean isPaytree) {
        if(!isPaytree){
            return false;
        }
        return path.contains("ay")||path.contains("efund")||path.contains("everse")||path.contains("onfirm")?true:false;
    }
    public  static  boolean isCreateOrderFlowFile(@NotBlank String path,boolean isPaytree) {
        if(isPaytree){
            return false;
        }
        return path.contains("ay")||path.contains("efund")||path.contains("everse")||path.contains("onfirm")?true:false;
    }
    public static  boolean isCreateNotifyInfoFile(@NotBlank String path) {
        return path.contains("TqcPay")?true:false;
    }
}