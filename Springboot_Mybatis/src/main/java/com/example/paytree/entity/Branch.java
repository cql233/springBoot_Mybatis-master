package com.example.paytree.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Branch   {

    private Integer branchId;

    private String branchCode;

    private String branchName;

    private String branchKanaName;

    private String branchRomaName;

    private String branchSelfCode;

    private String applyBranchCode;

    private String level;

    private String agentCode;

    private String parentCode;

    private Date contractSignDate;

    private Date contractModDate;

    private Date contractDischargeDate;

    private Integer refundDay;

    private String saleEndDate;

    private String clearingDate;

    private String arriveDates;

    private String contactName;

    private String contactKanaName;

    private String departmentName;

    private String chargeName;

    private String regionProvince;

    private String regionCityCounty;

    private String houseNum;

    private String mailCode;

    private String houseName;

    private String tel;

    private String phone;

    private String faxNum;

    private String email;

    private Integer accountId;

    private String journalType;

    private String payType;
    private String payName;

    private String status;

    private String refundFlag;

    private String operator;

    private String serviceMode;

    private Date createTime;

    private Date updateTime;

    private String extFld1;

    private String extFld2;

    private String identifyAutoBarcodeFlg;

    private String shopTempCode;

    private String jcbBranchCode;

    private String autoReceiptNoFlg;

    private String bankPayTerminalId;

    private String deletedRuleIds;

}