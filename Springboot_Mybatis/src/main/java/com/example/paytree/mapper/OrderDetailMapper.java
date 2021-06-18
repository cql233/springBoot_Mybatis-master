package com.example.paytree.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.BaseBean;
import com.example.paytree.entity.OrderDetail;


@Repository
public interface OrderDetailMapper {

    List<BaseBean> getOrderDetailList(Map orderDetailParameterMap);
    void insert(List<OrderDetail> list);
}
