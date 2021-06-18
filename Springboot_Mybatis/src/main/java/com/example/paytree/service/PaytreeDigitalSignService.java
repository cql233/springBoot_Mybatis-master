package com.example.paytree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paytree.entity.DigitalSign;
import com.example.paytree.mapper.DigitalSignMapper;


/**
 * 〈〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@Service
public class PaytreeDigitalSignService {
    @Autowired
    DigitalSignMapper digitalSignMapper;
    public String getPriKey(DigitalSign digitalSign){
        return digitalSignMapper.getPrivateKey(digitalSign);
    }
    public String getPubliKey(DigitalSign digitalSign){
        return digitalSignMapper.getPublicKey(digitalSign);
    }

}