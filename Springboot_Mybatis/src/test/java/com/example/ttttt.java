package com.example;

/**
 * 〈驼峰命名转db命名形式〉
 *
 * @author cql
 * @create 2021/1/7
 * @since 1.0.0
 */
public class ttttt {
    public static void main(String[] args) {
        System.out.println("驼峰转化前：");
        String str="id,orderId,parentTransStatus,parentFlowId,accessToken," +
                "serviceMode,amount,refundAmount,currencyCode,userCode,qrCode,mchId,subMchId,appId," +
                "subAppId,channelKey,branchCode,terminalCode,payType,payMethod,orderStatus,transType,transTime,payTransTime,transStatus," +
                " receiptNo,payCode,valueType,validTime,resultCode,errorCode,remark,refundReason,goodsTag," +
                "payPlatformTransTime,payPlatformTransNo,payPlatformTransId,appVersion,timeZone,locale," +
                "createTime,updateTime,extField1,extField2,errorInfo";
        String[] s=str.trim().split(",");
        System.out.println(str);
        StringBuilder result=new StringBuilder();
        for (String a:s
             ) {
            result.append(getchars(a)).append(",");
        }
        System.out.println("驼峰转化后：");
        System.out.println(result.toString());
    }
    public static String getchars(String temp){
        char[] chars=temp.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();

        for (char a:chars
             ) {
            if(a<='Z'&&a>='A'){
                stringBuilder.append("_"+(char)(a+32));
            }else{
                stringBuilder.append(a);
            }
        }
        return stringBuilder.toString();
    }
}