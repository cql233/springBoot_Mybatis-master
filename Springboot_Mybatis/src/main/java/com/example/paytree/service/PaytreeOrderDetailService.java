package com.example.paytree.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paytree.entity.BaseBean;
import com.example.paytree.mapper.OrderDetailMapper;

/**
 * 〈〉
 *
 * @author cql
 * @create 2020/6/16
 * @since 1.0.0
 */
@Service
public class PaytreeOrderDetailService {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    public List<BaseBean> getOrderDetailList(Map orderDetailParameterMap) {
        return orderDetailMapper.getOrderDetailList(orderDetailParameterMap);
    }
}