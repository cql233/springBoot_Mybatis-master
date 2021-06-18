package com.example.controller;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 〈 {differentiate} 是查找value的key〉
 *
 * @author cql
 * @create 2021/1/25
 * @since 1.0.0
 */
@RestController
@RequestMapping("/CSVUtil")
public class CSVUtilController {
    @PostMapping(value = "/{differentiate}")
    @ResponseBody
    public String  downloadCSVFile(@RequestParam("file") MultipartFile  file, @PathVariable String differentiate) throws IOException {
        Reader reader = new InputStreamReader(file.getInputStream(),"utf-8");
        int ch = 0;
        StringBuffer sb = new StringBuffer();
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        reader.close();
        //转json
        JSONObject jobj = JSON.parseObject(sb.toString());
        JSONArray movies = jobj.getJSONArray("decodedOrders");//构建JSONArray数组
        StringBuffer  bug=new StringBuffer();
        for (int i = 0 ; i < movies.size();i++){
            JSONObject file2= (JSONObject)movies.get(i);
            bug.append( (String)file2.get(differentiate)).append(";");
        }
        return  bug.toString();
    }

}