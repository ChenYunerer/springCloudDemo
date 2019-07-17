package com.yun.lcnmanager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class LcnManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcnManagerApplication.class, args);
    }

}
