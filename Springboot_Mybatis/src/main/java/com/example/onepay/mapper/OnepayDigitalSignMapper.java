package com.example.onepay.mapper;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.DigitalSign;

@Repository
public interface OnepayDigitalSignMapper {
    String getPublicKey(DigitalSign digitalSign);
    String getPrivateKey(DigitalSign digitalSign);
}
