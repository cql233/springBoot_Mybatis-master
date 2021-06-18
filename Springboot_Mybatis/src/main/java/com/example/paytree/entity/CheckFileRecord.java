package com.example.paytree.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 〈下载账单表〉
 *
 * @author cql
 * @create 2021/2/8
 * @since 1.0.0
 */
@Data
public class CheckFileRecord {
    private Integer checkFileRecordId;

    private String payType;

    private Date checkDate;

    private String channelPartnerAcct;

    private Date channelCreateTime;

    private String channelTransId;

    private BigDecimal channelAmount;

    private BigDecimal channelFee;

    private String channelTransType;

    private String channelTransStatus;

    private String outTransId;

    private String origOutTransId;

    private Date createTime;

    private Date upadteTime;

    private String isChecked;

    private String extFld1;

    private String extFld2;
}