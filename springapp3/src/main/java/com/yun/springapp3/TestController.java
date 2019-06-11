package com.yun.springapp3;

import com.yun.springapp3.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class TestController {

    @Value("${key}")
    private String key;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(@RequestBody TestBean testBean) {
        String responseStr = restTemplate.getForObject("http://spring-app/test", String.class);
        return "this is response from spring-app : " + responseStr + " testBean :" + testBean.toString();
    }
}
