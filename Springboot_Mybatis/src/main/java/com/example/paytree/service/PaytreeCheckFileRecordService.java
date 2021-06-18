package com.example.paytree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paytree.entity.CheckFileRecord;
import com.example.paytree.mapper.CheckFileRecordMapper;

/**
 * 〈造数据使用〉
 *
 * @author cql
 * @create 2021/2/8
 * @since 1.0.0
 */
@Service
public class PaytreeCheckFileRecordService {
        @Autowired
       private CheckFileRecordMapper checkFileRecordMapper;
        void insert(List<CheckFileRecord> list){
            checkFileRecordMapper.insert(list);
        }
}