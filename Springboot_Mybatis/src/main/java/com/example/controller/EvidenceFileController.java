package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.util.EvidenceUtil;

/**
 * 〈真实接口证迹获取〉
 *
 * @author cql
 * @create 2020/12/30
 * @since 1.0.0
 */
@RestController
@RequestMapping("/createFile")
public class EvidenceFileController {

    @PostMapping(value = "/downloadCSV/{differentiate}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void  downloadCSVFile(@RequestBody JSONObject requestInfo, @PathVariable String differentiate){
        EvidenceUtil.createCSVFile(requestInfo,requestInfo.get("requestUrl").toString().split(","),requestInfo.getString("shopName"),differentiate);
    }

}