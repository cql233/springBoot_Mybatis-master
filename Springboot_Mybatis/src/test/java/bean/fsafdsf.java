package bean;

import org.junit.Test;

import com.example.util.StringUtils;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/6/3
 * @since 1.0.0
 */
public class fsafdsf {
    @Test
    public void  ttt(){
        String abc="{amount=4&branchCode=ZZQ_ALIPAYPLUS_SANDBOX_SHOP&businessData={\"service\":\"WEB\"}&currencyCode=JPY&extendInfo=&locale=JAPAN&merchantId=OB0278325798&notifyUrl=https://pre.onepay.finance/noticeme/notify2me&payType=GN01&remark=&reqTime=20210603175500&returnUrl=https://www.baidu.com/&subject=mobile&timeZone=p9&transNonce=zzqtest001&validTime=5}\n";
        System.out.println(getNewStordStr(abc));
    }
    public static String getNewStordStr(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }
        int startIndex=str.indexOf("{",1);
        int endIndex=str.indexOf("}",1);
        if(startIndex<=-1){
            return str;
        }
        String aatwo=str.substring(startIndex+1,endIndex);
        String aathree="\""+aatwo.replaceAll("=","\":\"").replaceAll("&","\",\"")+"\"";
        String newStr=str.replace(aatwo,aathree);
        return newStr;
    }
}