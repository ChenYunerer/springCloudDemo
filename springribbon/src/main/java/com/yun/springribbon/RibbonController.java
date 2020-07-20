package com.yun.springribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yun.springribbon.bean.TestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    private static final Logger log = LoggerFactory.getLogger(RibbonController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private FeignClient feignClient;

    @HystrixCommand(fallbackMethod = "ribbonError")
    @RequestMapping("/ribbon")
    public String ribbon(){
        log.info("Handling home");
        //ServiceInstance serviceInstance = loadBalancer.choose("SPRING-APP3");
        //return restTemplate.getForObject("http://spring-app3/test", String.class);
        //return serviceInstance.getPort() + "";
        TestBean testBean = new TestBean();
        testBean.setKey("a");
        testBean.setValue("1");
        return feignClient.test(testBean);
    }

    public String ribbonError(){
        return "ribbonError";
    }
}
