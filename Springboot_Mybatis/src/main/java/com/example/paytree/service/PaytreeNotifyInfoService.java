package com.example.paytree.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.paytree.entity.NotifyInfo;
import com.example.paytree.mapper.NotifyInfoMapper;

/**
 * 〈〉
 *
 * @author cql
 * @create 2020/12/25
 * @since 1.0.0
 */
public class PaytreeNotifyInfoService {
    @Autowired
    private NotifyInfoMapper notifyInfoMapper;
    public NotifyInfo getNotifyInfo(String detailId){
        return notifyInfoMapper.getNotifyInfo(detailId);
    }
}