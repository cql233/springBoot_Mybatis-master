package com.example.paytree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paytree.entity.BaseBean;
import com.example.paytree.mapper.OrderMainMapper;


/**
 * 〈〉
 *
 * @author cql
 * @create 2020/6/16
 * @since 1.0.0
 */
@Service
public class PaytreeOrderMainService {
    @Autowired
    private OrderMainMapper orderMainMapper;
    public List<BaseBean> getOrderMain(String  orderId){
        return  orderMainMapper.getOrderMainList(orderId);
    }

}