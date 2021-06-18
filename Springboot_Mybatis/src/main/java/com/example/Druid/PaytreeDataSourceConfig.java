package com.example.Druid;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;

/**
 * 〈paytree的datasource 配置〉
 *
 * @author cql
 * @create 2020/12/24
 * @since 1.0.0
 */
@Component
@MapperScan(basePackages = "com.example.paytree.mapper",sqlSessionFactoryRef = "paytreeSqlSessionFactory")
public class PaytreeDataSourceConfig extends  DataSourceConfig{
    @Bean(name="paytreeDataSource")
    @Primary
    public DataSource getPaytreeDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(datasource.getPaytree().getDriverClassName());
        dataSource.setDbType(datasource.getPaytree().getType());
        dataSource.setUsername(datasource.getPaytree().getUsername());
        dataSource.setPassword(datasource.getPaytree().getPassword());
        dataSource.setUrl(datasource.getPaytree().getUrl());
        dataSource.setInitialSize(druid.getInitialSize());
        dataSource.setMinIdle(druid.getMinIdle());
        dataSource.setMaxActive(druid.getMaxActive());
        return dataSource;
    }
    @Bean(name="paytreeTransactionManager")
    @Primary
    public DataSourceTransactionManager onepayDataSourceTransactionManager(@Qualifier("paytreeDataSource") DataSource paytreeDataSource){
        return new DataSourceTransactionManager(paytreeDataSource);
    }
    @Bean(name = "paytreeSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("paytreeDataSource") DataSource paytreeDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(paytreeDataSource);
        String mapperLocation = "classpath:paytree.mapper/*.xml";
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(mapperLocation));
        return sessionFactory.getObject();
    }
}