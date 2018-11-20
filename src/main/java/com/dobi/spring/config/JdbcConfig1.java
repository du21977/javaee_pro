package com.dobi.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * 属性注入方式2---SpringBoot方式
 *
 * Spring1中都是用xml来创建对象
 Spring2中基本用xml和注解结合来创建对象，通过xml来设置扫描有注解的类
 通过反射来创建对象
 Spring3完全用注解来代替xml了
 1.@Configuration:声明一个类作为配置类，代替xml
 2.@Bean:声明在方法上，将方法的返回值加入Bean容器，代替<bean>标签
 3.@Value:属性注入
 4.@PropertySource:指定外部属性文件
 */


//@Configuration //把他当成一个xml来看了
//@EnableConfigurationProperties(JdbcProperties.class) //使用配置属性--JdbdProperties
public class JdbcConfig1 {


    @Bean  //这个就相当于new对象啦，相当于之前xml文件中的<bean>标签
    public DataSource dataSource(JdbcProperties prop ){
        //数据库连接池
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(prop.getDriverClassName());
        druidDataSource.setUrl(prop.getUrl());
        druidDataSource.setUsername(prop.getUsername());
        druidDataSource.setPassword(prop.getPassword());
        return  druidDataSource;
    }

}
