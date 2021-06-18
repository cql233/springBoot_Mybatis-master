package com.example.common.entity;

import lombok.Data;

/**
 * 〈公私钥的bean〉
 *
 * @author cql
 * @create 2021/3/18
 * @since 1.0.0
 */
@Data
public class KeyBean {
    //db存储的key
    private String publickeyForDb;
    private String privateKey;
    //上送的key
    private String publickeyForBody;
}