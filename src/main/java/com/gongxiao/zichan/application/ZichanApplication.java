package com.gongxiao.zichan.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
@MapperScan(basePackages = {"com.gongxiao.zichan.dao","com.gongxiao.zichan.mapper"})
@ComponentScan(basePackages = {"com.gongxiao.zichan.controller","com.gongxiao.zichan.service","com.gongxiao.zichan.model","com.gongxiao.zichan.dao"})
public class ZichanApplication extends SpringBootServletInitializer {

    @PostConstruct
    void started(){
        TimeZone timeZone = TimeZone.getTimeZone("GMT+8");
        TimeZone.setDefault(timeZone);
    }

    public static void main(String[] args) {
        SpringApplication.run(ZichanApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(ZichanApplication.class);
    }

}
