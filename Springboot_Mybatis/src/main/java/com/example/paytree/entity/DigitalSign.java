package com.example.paytree.entity;

import java.util.Date;

import lombok.Data;

/**
 * 〈〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@Data
public class DigitalSign {
    private String id;
    private String branchCode;
    private String terminalCode;
    private String clientPublicKey;
    private String clientPrivateKey;
    private String serverPublicKey;
    private String serverPrivateKey;
    private String cipherType;
    private Date createTime;
    private Date updateTime;
    private String extField1;
    private String extField2;
}