package com.example.onepay.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.onepay.entity.OrderFlow;
import com.example.paytree.entity.BaseBean;

@Repository
public interface OnepayOrderFlowMapper {
     List<BaseBean> getOrderFlowList(Map map) ;
     void update(OrderFlow orderFlow);
}
