package com.example.paytree.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.BaseBean;
import com.example.paytree.entity.OrderMain;


@Repository
public interface OrderMainMapper {
    List<BaseBean> getOrderMainList(String orderId);
    void insert(List<OrderMain> list);
}
