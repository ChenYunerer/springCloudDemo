package com.yun.springapp2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${key}")
    private String key;

    @RequestMapping("/test")
    public String test(){
        return "response of test key :" + key + " 8082" ;
    }

    @RequestMapping("/test2")
    public String test2() {
        return "i am test2 from 8082";
    }
}
