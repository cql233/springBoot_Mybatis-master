package com.example.Druid;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 〈onepay的数据源配置〉
 *
 * @author cql
 * @create 2020/12/24
 * @since 1.0.0
 */
@Component
@MapperScan(basePackages = "com.example.onepay.mapper",sqlSessionFactoryRef = "onepaySqlSessionFacotry")
public class OnepayDataSourceConfig extends  DataSourceConfig{
    @Bean(name="onepayDataSource")
    public DataSource getOnepayDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(datasource.getOnepay().getDriverClassName());
        dataSource.setDbType(datasource.getOnepay().getType());
        dataSource.setUsername(datasource.getOnepay().getUsername());
        dataSource.setPassword(datasource.getOnepay().getPassword());
        dataSource.setUrl(datasource.getOnepay().getUrl());
        dataSource.setInitialSize(druid.getInitialSize());
        dataSource.setMinIdle(druid.getMinIdle());
        dataSource.setMaxActive(druid.getMaxActive());
        return dataSource;
    }
    @Bean(name="onepayTransactionManager")
    public DataSourceTransactionManager onepayDataSourceTransactionManager(@Qualifier("onepayDataSource") DataSource onepayDataSource){
        return new DataSourceTransactionManager(onepayDataSource);
    }
    @Bean(name = "onepaySqlSessionFacotry")
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("onepayDataSource") DataSource onepayDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(onepayDataSource);
        String mapperLocation = "classpath:onepay/mapper/*.xml";
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(mapperLocation));
        return sessionFactory.getObject();
    }
}