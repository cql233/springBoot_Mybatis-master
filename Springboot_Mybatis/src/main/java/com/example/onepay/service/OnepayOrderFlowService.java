package com.example.onepay.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onepay.entity.OrderFlow;
import com.example.onepay.mapper.OnepayOrderFlowMapper;
import com.example.paytree.entity.BaseBean;

/**
 * 〈〉
 *
 * @author cql
 * @create 2020/12/31
 * @since 1.0.0
 */
@Service
public class OnepayOrderFlowService {
    @Autowired
    OnepayOrderFlowMapper onepayOrderFlowMapper;
    public List<BaseBean> getList(Map map){
        return onepayOrderFlowMapper.getOrderFlowList(map);
    }
    public void update(OrderFlow orderFlow){
         onepayOrderFlowMapper.update(orderFlow);
    }
}