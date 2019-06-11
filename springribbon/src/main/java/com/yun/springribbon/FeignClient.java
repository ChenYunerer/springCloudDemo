package com.yun.springribbon;

import com.yun.springribbon.bean.TestBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.openfeign.FeignClient(value = "spring-app3", fallback = HystrixClientFallback.class)
public interface FeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test(TestBean testBean);

}
