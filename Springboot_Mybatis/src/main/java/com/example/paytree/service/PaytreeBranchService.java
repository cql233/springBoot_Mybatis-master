package com.example.paytree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.paytree.entity.Branch;
import com.example.paytree.mapper.BranchMapper;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/3/8
 * @since 1.0.0
 */
@Service
public class PaytreeBranchService {
@Autowired
    BranchMapper branchMapper;
    @Transactional
void insertBranch(List<Branch> list){
    branchMapper.insertBranch(list);
}
}