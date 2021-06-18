package com.example.paytree.mapper;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.DigitalSign;

@Repository
public interface DigitalSignMapper {
    String getPublicKey(DigitalSign digitalSign);
    String getPrivateKey(DigitalSign digitalSign);
}
