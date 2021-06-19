package com.example.Druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.Druid.bean.Datasource;
import com.example.Druid.bean.Druid;
import lombok.Data;

/**
 * 〈〉
 *
 * @author cql
 * @create 2020/12/24
 * @since 1.0.0
 */

@ConfigurationProperties(prefix = "spring.application")
@Component
@Data
public class DataSourceConfig {
    private String name;
    @Autowired
    public Datasource datasource;
    @Autowired
    public  Druid druid;

}