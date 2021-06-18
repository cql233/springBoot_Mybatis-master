package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onepay.entity.OrderFlow;
import com.example.onepay.service.OnepayOrderFlowService;

/**
 * 〈只是用來修改db用的〉
 *
 * @author cql
 * @create 2021/4/29
 * @since 1.0.0
 */
@RestController
@RequestMapping("/UpdateMysql")
public class UpdateMysqlController {
    @Autowired
    OnepayOrderFlowService onepayOrderFlowService;
    public static final Logger LOG=Logger.getLogger(UpdateMysqlController.class);
    @PostMapping(value = "/orderFlow", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateOrderFlow(@RequestBody OrderFlow orderFlow){
        String flag="FAILURE";
        onepayOrderFlowService.update(orderFlow);
        flag="SUCCESS";
        return flag;
    }
}