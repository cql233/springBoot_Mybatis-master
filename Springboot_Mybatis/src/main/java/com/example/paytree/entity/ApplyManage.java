package com.example.paytree.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ApplyManage   {
     int id;
     String agentCode;
     String applyBranchCode;
     String fileName;
     Date downloadTime;
     Date importTime;
     String status;
     Date pkUploadTime;
     String pkStatus;
     String pkFileName;
     String importLogFileName;
     Date createTime;
     Date updateTime;
     String extFld1;
     String extFld2;
}