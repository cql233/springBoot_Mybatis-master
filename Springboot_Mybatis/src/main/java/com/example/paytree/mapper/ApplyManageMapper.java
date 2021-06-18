package com.example.paytree.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.ApplyManage;

@Repository
public interface ApplyManageMapper {
    void insertApplyManage(List<ApplyManage> list);
}
