package com.example.paytree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paytree.entity.ApplyManage;
import com.example.paytree.mapper.ApplyManageMapper;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/3/8
 * @since 1.0.0
 */
@Service
public class PaytreeApplyManageService {
    @Autowired
     ApplyManageMapper applyManageMapper;
    @Transactional
    void insert(List<ApplyManage> list){
        applyManageMapper.insertApplyManage(list);
    }
}