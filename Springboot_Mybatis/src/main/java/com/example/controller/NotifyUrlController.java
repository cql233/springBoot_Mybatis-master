package com.example.controller;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈测试使用〉
 *
 * @author cql
 * @create 2020/11/4
 * @since 1.0.0
 */
@RestController
@RequestMapping("/notify")
public class NotifyUrlController {
    public int index=0;
    @GetMapping(value = "/one")
    @ResponseBody
        public ResponseEntity<T> getResultForGet(){
        ResponseEntity<T> result;
        result = getResult();
        return result;
        }
        @PostMapping(value = "/post",consumes = MediaType.APPLICATION_JSON_VALUE)
        @ResponseBody
    public ResponseEntity<String> getResultForPost(){
            ResponseEntity<String> result;
            result = getResult2();
            return result;
        }
         ResponseEntity<T> getResult(){
            ResponseEntity<T> responseEntity;
            index++;
            if(index!=3){
                responseEntity = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }else{
                responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
                index=0;
            }
            return responseEntity;
        }
    ResponseEntity<String> getResult2(){
        ResponseEntity<String> responseEntity;
        index++;
        if(index!=3){
            responseEntity = new ResponseEntity<>("", HttpStatus.NOT_FOUND);
        }else{
            responseEntity = new ResponseEntity<>("OK", HttpStatus.OK);
            index=0;
        }
        return responseEntity;
    }
}