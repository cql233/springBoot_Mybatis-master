package com.example.onepay.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.example.paytree.entity.BaseBean;
import lombok.Data;

@Data
public class OrderFlow extends BaseBean {
    /**
     * @author cql
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String orderId;

    private String parentTransStatus;

    private String parentFlowId;

    private String accessToken;

    private String serviceMode;

    private BigDecimal amount;

    private BigDecimal refundAmount;

    private String currencyCode;

    private String userCode;

    private String qrCode;

    private String mchId;

    private String subMchId;

    private String appId;

    private String subAppId;

    private String channelKey;

    private String branchCode;

    private String terminalCode;

    private String payType;

    private String payMethod;

    private String orderStatus;

    private String transType;

    private Date transTime;

    private Date payTransTime;

    private String transStatus;

    private String receiptNo;

    private String payCode;

    private String valueType;

    private Integer validTime;

    private String resultCode;

    private String errorCode;

    private String remark;

    private String refundReason;

    private String goodsTag;

    private String payPlatformTransTime;

    private String payPlatformTransNo;

    private String payPlatformTransId;

    private String appVersion;

    private String timeZone;

    private String locale;

    private String  createTime;

    private String updateTime;

    private String extField1;

    private String extField2;

    private String errorInfo;
    @Override
    public String toRow() {
        //todo
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                id,orderId,parentTransStatus,parentFlowId,accessToken,
                serviceMode,amount,refundAmount,currencyCode,userCode,qrCode,mchId,subMchId,appId,
                subAppId,channelKey,branchCode,terminalCode,payType,payMethod,orderStatus,transType,transTime,payTransTime,transStatus,
                receiptNo,payCode,valueType,validTime,resultCode,errorCode,remark,refundReason,goodsTag,
                payPlatformTransTime,payPlatformTransNo,payPlatformTransId,appVersion,timeZone,locale,
                createTime,updateTime,extField1,extField2,errorInfo);
    }

    @Override
    public String[] getHear() {
        String[] hear=new String[]{"id","orderId","parentTransStatus","parentFlowId","accessToken",
                "serviceMode","amount","refundAmount","currencyCode","userCode","qrCode","mchId","subMchId","appId",
        "subAppId","channelKey","branchCode","terminalCode","payType","payMethod","orderStatus","transType","transTime","payTransTime","transStatus",
                "receiptNo","payCode","valueType","validTime","resultCode","errorCode","remark","refundReason","goodsTag",
                "payPlatformTransTime","payPlatformTransNo","payPlatformTransId","appVersion","timeZone","locale",
                "createTime","updateTime","extField1","extField2","errorInfo"};
        return hear;
    }
    @Override
    public String getFileType(){
        return "orderFlow";
    }
}