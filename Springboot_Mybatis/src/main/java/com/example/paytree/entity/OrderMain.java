package com.example.paytree.entity;

import lombok.Data;

@Data
public class OrderMain extends BaseBean {
    private static final long serialVersionUID = 1L;

    private String orderId;

    private String orderStatus;

    private String branchCode;

    private String payType;

    private String receiptNo;

    private String userCode;

    private String qrCode;

    private String mchId;

    private String subMchId;

    private String appId;

    private String subAppId;

    private String channelKey;

    private String payCode;

    private String appVersion;

    private String serviceMode;

    private String createTime;

    private String updateTime;

    private String extField1;

    private String extField2;

    private String valueType;

    @Override
    public String toRow() {
        return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"",this.orderId,this.orderStatus,
                this.branchCode,payType,receiptNo,userCode,qrCode,mchId,subMchId,
                appId,subAppId,channelKey,payCode,appVersion,serviceMode,createTime,
                updateTime,extField1,extField2,valueType);
    }

    @Override
    public String[] getHear() {
        String[] hear=new String[]{"orderId","orderStatus","branchCode","payType","receiptNo",
                "userCode","qrCode","mchId","subMchId","appId","subAppId","channelKey","payCode",
                "appVersion","serviceMode","createTime","updateTime","extField1","extField2","valueType"};
        return hear;
    }
    @Override
    public String getFileType(){
        return "orderMain";
    }
}