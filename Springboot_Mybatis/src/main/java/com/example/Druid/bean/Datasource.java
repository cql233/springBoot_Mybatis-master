package com.example.Druid.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/6/18
 * @since 1.0.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datasource {
    @Autowired
    public Paytree paytree;
    @Autowired
    public  Onepay onepay;

}