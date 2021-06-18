package com.example.onepay.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.BaseBean;

@Repository
public interface OnepayAccessHistoryMapper {
    List<BaseBean> getAccessHistoryList(Map map);
}
