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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Druid {
    protected int initialSize;
    protected int minIdle;
    protected int maxActive;
}