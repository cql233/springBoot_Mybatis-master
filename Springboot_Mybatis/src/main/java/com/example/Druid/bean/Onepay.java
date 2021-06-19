package com.example.Druid.bean;

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
public class Onepay {
    protected String driverClassName;
    protected String type;
    protected String url;
    protected String username;
    protected String password;
}