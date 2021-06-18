package com.example.Druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 〈〉
 *
 * @author cql
 * @create 2020/12/24
 * @since 1.0.0
 */

@ConfigurationProperties(prefix = "spring.application")
@Component
@Getter
@Setter
public class DataSourceConfig {
    private String name;
    protected DoubleDataSource datasource=new DoubleDataSource();
    protected Druid druid=new Druid();
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class DoubleDataSource {
        protected String paytreeDriverClassName;
        protected String paytreeType;
        protected String paytreeUrl;
        protected String paytreeUsername;
        protected String paytreePassword;
        protected String onepayDriverClassName;
        protected String onepayType;
        protected String onepayUrl;
        protected String onepayUsername;
        protected String onepayPassword;
    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public class Druid {
        protected int initialSize;
        protected int minIdle;
        protected int maxActive;
    }
}