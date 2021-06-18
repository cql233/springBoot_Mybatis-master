package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.paytree.entity.ApplyManage;
import com.example.paytree.mapper.ApplyManageMapper;
import com.example.paytree.service.PaytreeApplyManageService;

/**
 * 〈批量插入申请表数据〉
 *
 * @author cql
 * @create 2021/3/8
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class insertApplyManageTest {
    @Autowired
     PaytreeApplyManageService paytreeApplyManageService;
    @Autowired
    ApplyManageMapper applyManageMapper;
    @Test
    public void  insert(){

        insertApplyManage(20000);
    }
    public void insertApplyManage(int index){
        List<ApplyManage> list=new ArrayList<>();
        for(int i=1;i<=index;i++){
            list.add(getApplyManage());
            if(i%5000==0){
                applyManageMapper.insertApplyManage(list);
                list.clear();
            }
        }
        if(list.size()>0)
            applyManageMapper.insertApplyManage(list);
    }
    public ApplyManage getApplyManage(){
        ApplyManage applyManage=new ApplyManage();
        applyManage.setAgentCode("10019520");
        applyManage.setApplyBranchCode("C_2915c4d9_a4f9_401a_95de_05bdd8e00694_Uzxj0mTDQv");
        applyManage.setFileName("10019520_twelve_2021012816045216_000.xml");
        applyManage.setDownloadTime(new Date());
        applyManage.setImportTime(new Date());
        applyManage.setStatus("05");
        applyManage.setPkUploadTime(new Date());
        applyManage.setPkStatus("05");
        applyManage.setPkFileName("PK_10019520_twelve_2021012816045216_000.xml");
        applyManage.setCreateTime(new Date());
        applyManage.setUpdateTime(new Date());
        applyManage.setExtFld1("cql233");
        return applyManage;
    }
}