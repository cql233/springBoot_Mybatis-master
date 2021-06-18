package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.util.CreateFileUtil;

/**
 * 〈stub截取证迹使用〉
 *
 * @author cql
 * @create 2020/12/30
 * @since 1.0.0
 */
@RestController
@RequestMapping("/stub")
public class StubGetFileController {
    /**
     * 有postman传递token，java下载json文件
     * @param token  stub接口专用
     * @return
     */
    @PostMapping(value = "/downloadJSON/{token}/{shopName}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean downloadJSONFile(@RequestBody JSONObject requestInfo, @PathVariable String token, @PathVariable String shopName){
        requestInfo.put("requestUrl",requestInfo.get("requestUrl").toString().replace(",","/"));
        String jsonString1= JSONObject.toJSONString(requestInfo);
        String fileName="";
        fileName=getFileName(requestInfo.get("requestUrl").toString().replace(",","/"),shopName);
        createFile(jsonString1,fileName);
        return true;
    }
    public String getFileName(String url,String shopName){
        String fileName="";
        String[] lists=url.split("/");
        if(lists[2].contains("version")){
            if(lists[2].contains("1.1")){
                fileName=lists[1]+"_有扩张_version=1.1_"+lists[3]+"_"+shopName+"_"+lists[6];
            }
            else if(lists[2].contains("1.0")){
                fileName=lists[1]+"_有扩张_version=1.0_"+lists[3]+"_"+shopName+"_"+lists[6];
            }else {
                fileName=lists[1]+"_有扩张_"+lists[3]+"_"+shopName+"_"+lists[6];
            }

        }else{
            fileName=lists[1]+"_无扩张_"+lists[2]+"_"+shopName+"_"+lists[5];
        }
        return fileName;
    }
    public void createFile(String jsonString1,String fileName){
        String filePath="";
        if(fileName.contains("pay")||fileName.contains("Pay")){
//            CreateFileUtil.createJsonFile(jsonString1, "C:\\Users\\hspcadmin\\Desktop\\war\\access_history\\pay", fileName);
            CreateFileUtil.createJsonFile(jsonString1, "/opt/wpay/resource/gateway/cql/access_history/pay", fileName);
        }else if(fileName.contains("refund")||fileName.contains("Refund")){
//            CreateFileUtil.createJsonFile(jsonString1, "C:\\Users\\hspcadmin\\Desktop\\war\\access_history\\refund", fileName);
            CreateFileUtil.createJsonFile(jsonString1, "/opt/wpay/resource/gateway/cql/access_history/refund", fileName);
        }else if(fileName.contains("reverse")||fileName.contains("Reverse")){
//            CreateFileUtil.createJsonFile(jsonString1, "C:\\Users\\hspcadmin\\Desktop\\war\\access_history\\reverse", fileName);
            CreateFileUtil.createJsonFile(jsonString1, "/opt/wpay/resource/gateway/cql/access_history/reverse", fileName);
        }else if(fileName.contains("confirm")||fileName.contains("Confirm")){
//            CreateFileUtil.createJsonFile(jsonString1, "C:\\Users\\hspcadmin\\Desktop\\war\\access_history\\confirm", fileName);
            CreateFileUtil.createJsonFile(jsonString1, "/opt/wpay/resource/gateway/cql/access_history/confirm", fileName);
        }
    }
}