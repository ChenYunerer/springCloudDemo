package com.yun.springapp2;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RefreshScope
@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class SpringApp2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp2Application.class, args);
    }

}

