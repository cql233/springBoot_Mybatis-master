package com.example.paytree.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paytree.entity.BaseBean;
import com.example.paytree.mapper.AccessHistoryMapper;

/**
 * 〈〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@Service
public class PaytreeAccessHistoryService {
    @Autowired
    private AccessHistoryMapper accessHistoryMapper;
    public boolean isPaytree(Map map){
        return accessHistoryMapper.isPaytree(map)>0L?true:false;
    }
    public List<BaseBean> getList(Map map){
        return accessHistoryMapper.getAccessHistoryList(map);
    }
}