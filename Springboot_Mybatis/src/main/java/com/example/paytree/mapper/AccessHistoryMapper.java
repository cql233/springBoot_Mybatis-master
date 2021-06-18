package com.example.paytree.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.BaseBean;

@Repository
public interface AccessHistoryMapper {
    List<BaseBean> getAccessHistoryList(Map map);
    Long  isPaytree(Map map);
}
