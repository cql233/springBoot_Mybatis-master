package com.example.paytree.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.paytree.entity.NotifyInfo;


@Repository
public interface NotifyInfoMapper {
    NotifyInfo getNotifyInfo(@Param( "detailId") String detailId);
}
