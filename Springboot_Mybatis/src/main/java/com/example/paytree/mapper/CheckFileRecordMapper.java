package com.example.paytree.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.CheckFileRecord;

@Repository
public interface CheckFileRecordMapper {
    void insert(List<CheckFileRecord> list);
}
