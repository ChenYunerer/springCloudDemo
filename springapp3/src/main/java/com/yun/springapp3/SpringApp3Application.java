package com.yun.springapp3;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class SpringApp3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp3Application.class, args);
    }

}
