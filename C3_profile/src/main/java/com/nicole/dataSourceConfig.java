/**
 * FileName: dataSourceConfig
 * Author: nicole
 * Date: 2019/5/19 20:28
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/5/19
 * desc:
 */

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

@Configuration
public class dataSourceConfig {

    //开发环境
    @Bean(destroyMethod="shutdown")
    @Profile("dev")
    public DataSource embeddedDataSource(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }

    //生产环境
    @Bean
    @Profile("prod")
    public DataSource jndiDataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean =
                new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) jndiObjectFactoryBean.getObject();
    }

    //QA环境
    public DataSource basicDateSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:h2:tcp://dnserver/~/test");
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("password");
        dataSource.setInitialSize(20);
        dataSource.setMaxActive(30);
        return dataSource;
    }


}
