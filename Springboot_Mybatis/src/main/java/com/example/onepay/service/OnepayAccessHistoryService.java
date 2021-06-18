package com.example.onepay.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onepay.mapper.OnepayAccessHistoryMapper;
import com.example.paytree.entity.BaseBean;

/**
 * 〈〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@Service
public class OnepayAccessHistoryService {
    @Autowired
    private OnepayAccessHistoryMapper onepayAccessHistoryMapper;
    public List<BaseBean> getList(Map map){
        return onepayAccessHistoryMapper.getAccessHistoryList(map);
    }
}