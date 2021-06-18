package com.example.paytree.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderDetail  extends BaseBean {
    private static final long serialVersionUID = 1L;

    private String orderDetailId;

    private String orderId;

    private String currencyCode;

    private String terminalCode;

    private String locale;

    private String timeZone;

    private String transType;

    private BigDecimal amount;

    private BigDecimal refundAmount;

    private String refundReason;

    private String remark;

    private String goodsTag;

    private String accessToken;

    private String transId;

    private String transStatus;

    protected String transTime;

    private String resultCode;

    private String errorCode;

    private String errorInfo;

    private String parentDetailId;
//类型特殊处理
    private String createTime;
    //类型特殊处理
    private String updateTime;

    private String validTime;

    private String extField1;

    private String extField2;

    public OrderDetail() {
    }
    @Override
    public String toRow() {
        return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"",this.orderDetailId,this.orderId,
                this.currencyCode,terminalCode,locale,timeZone,transType,amount,refundAmount,
                refundReason,remark,goodsTag,accessToken,transId,transStatus,transTime,
                resultCode,errorCode,errorInfo,parentDetailId,createTime,updateTime,validTime,extField1,extField2);
    }

    @Override
    public String[] getHear() {
        String[] hear=new String[]{"orderDetailId","orderId","currencyCode","terminalCode","locale",
                "timeZone","transType","amount","refundAmount",
                "refundReason","remark","goodsTag","accessToken","transId","transStatus","transTime",
                "resultCode","errorCode","errorInfo","parentDetailId","createTime","updateTime","validTime","extField1","extField2"};
        return hear;
    }
    @Override
    public String getFileType(){
        return "orderDetail";
    }
}