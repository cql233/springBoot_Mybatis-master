package com.example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.paytree.entity.CheckFileRecord;
import com.example.paytree.entity.OrderDetail;
import com.example.paytree.entity.OrderMain;
import com.example.paytree.mapper.CheckFileRecordMapper;
import com.example.paytree.mapper.OrderDetailMapper;
import com.example.paytree.mapper.OrderMainMapper;

/**
 *
 * @author cql
 * @create 2021/2/8
 * @since 1.0.0
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:application.yml"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class insertCheckFileRecordTest {
    @Autowired
    CheckFileRecordMapper checkFileRecordMapper;
    @Autowired
    OrderMainMapper orderMainMapper;
    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Test
    public void  insertList(){
//        getList("O25",20001);
        getList("24",20001);
        getList("MG03",20001);
//        getList("O25",20001);
    }

    public Map<String,Object> getList(String payType,int num){
        if(num<=0){
            System.out.println("无传值");
            return  null;
        }
        Map<String ,Object> map=new HashMap<>();
        //共同的地方
        /*
        order_id
        detail_id=out-trans-id
        trans_id=channel_id
        trans_time=channel_create_time
        channel_trans_type=trans_type
        channel_trans_status=trans_status=order_status
        pay_type
         */
        List<CheckFileRecord> cfrs=new ArrayList<>();
        List<OrderMain> oms=new ArrayList<>();
        List<OrderDetail> ods=new ArrayList<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyyMMddhhmmss");
        for(int i=1;i<num;i++){
            //拼装共同数值
            String detailId=generateByRandom(32);
            String orderId=generateByRandom(32);
            System.out.println(orderId);
            String transId= generateByRandom(16);
            String acct=generateByRandom(6);
            Date transTime=new Date();
            String transFerTime=sdf.format(transTime);
            String channel_trans_type="01";
            String channel_trans_status="00";
            BigDecimal amount=new BigDecimal(Math.random()*100);
            BigDecimal lastAmount=amount.setScale(0,BigDecimal.ROUND_DOWN);
        //获取checkFileRecord
        //获取order_main
        //获取order_detail

            CheckFileRecord checkFileRecord=new CheckFileRecord();
            checkFileRecord.setPayType(payType);
            checkFileRecord.setCheckDate(new Date());
            checkFileRecord.setChannelPartnerAcct(acct);
            checkFileRecord.setChannelCreateTime(transTime);
            checkFileRecord.setChannelTransId(transId);
            checkFileRecord.setChannelAmount(lastAmount);
//            checkFileRecord.setChannelFee(null);
            checkFileRecord.setChannelTransType(channel_trans_type);
            checkFileRecord.setChannelTransStatus(channel_trans_status);
            checkFileRecord.setOutTransId(detailId);
            checkFileRecord.setOrigOutTransId("");
            checkFileRecord.setCreateTime(new Date());
            checkFileRecord.setUpadteTime(new Date());
            checkFileRecord.setIsChecked("0");
            checkFileRecord.setExtFld1("cql233");
            checkFileRecord.setExtFld2("");
            cfrs.add(checkFileRecord);

            OrderMain orderMain=new OrderMain();
            orderMain.setOrderId(orderId);
            orderMain.setOrderStatus(channel_trans_status);
            orderMain.setBranchCode("");
            orderMain.setPayType(payType);
            orderMain.setReceiptNo("");
            orderMain.setUserCode("");
            orderMain.setMchId("");
            orderMain.setSubMchId("");
            orderMain.setAppId("");
            orderMain.setSubAppId("");
            orderMain.setChannelKey("");
            orderMain.setPayCode("");
            orderMain.setAppVersion("dmc-0.001-pay");
            orderMain.setCreateTime(transFerTime);
            orderMain.setUpdateTime(transFerTime);
            orderMain.setExtField1("cql233");
            orderMain.setExtField2("");
            orderMain.setServiceMode("02");
            orderMain.setValueType("A");
            orderMain.setQrCode("");
            oms.add(orderMain);

            OrderDetail orderDetail=new OrderDetail();
            orderDetail.setOrderDetailId(detailId);
            orderDetail.setTransStatus(channel_trans_status);
            orderDetail.setAccessToken(RandomStringUtils.randomAlphanumeric(54));
            orderDetail.setOrderId(orderId);
            orderDetail.setCurrencyCode("JPY");
            orderDetail.setTerminalCode("");
            orderDetail.setLocale("JAPAN");
            orderDetail.setTimeZone("p9");
            orderDetail.setTransType(channel_trans_type);
            orderDetail.setAmount(lastAmount);
//            orderDetail.setRefundAmount();
            orderDetail.setTransId(transId);
            orderDetail.setTransTime(sdf2.format(transTime));
            orderDetail.setResultCode("SUCCESS");
            orderDetail.setCreateTime(transFerTime);
            orderDetail.setUpdateTime(transFerTime);
            orderDetail.setExtField1("cql233");
            ods.add(orderDetail);
            if(i%5000==0){
                checkFileRecordMapper.insert(cfrs);
                cfrs.clear();
                orderMainMapper.insert(oms);
                oms.clear();
                orderDetailMapper.insert(ods);
                ods.clear();
    }

}
        if(cfrs.size()>0)
            checkFileRecordMapper.insert(cfrs);
        if(oms.size()>0)
            orderMainMapper.insert(oms);
        if(ods.size()>0)
            orderDetailMapper.insert(ods);
        return map;
    }

    /**
     * 生成数字和字母组合，字母区分大小写
     *
     * @param length 随机字符串的长度
     * @return
     */
    public static String generateByRandom(final int length) {
        StringBuilder randomSb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            // 字符串
            if ("char".equals(charOrNum)) {
                // 判断字母大小写
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                randomSb = randomSb.append((char) (choice + random.nextInt(26)));
            } else {
                randomSb = randomSb.append(random.nextInt(10));
            }
        }
        return randomSb.toString();
    }
}