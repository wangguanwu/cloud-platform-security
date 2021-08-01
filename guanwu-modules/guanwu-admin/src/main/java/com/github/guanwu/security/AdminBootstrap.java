package com.github.guanwu.security;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.mapper.provider.base.BaseInsertProvider;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.github.guanwu.security.modules.*.mapper")
@EnableSwagger2Doc
@EnableAsync
public class AdminBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(AdminBootstrap.class, args);
    }

}
