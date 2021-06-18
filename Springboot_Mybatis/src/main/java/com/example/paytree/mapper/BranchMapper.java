package com.example.paytree.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.paytree.entity.Branch;

@Repository
public interface BranchMapper {
    void insertBranch(List<Branch> list);
}
