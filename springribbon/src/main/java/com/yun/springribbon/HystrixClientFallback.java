package com.yun.springribbon;

import com.yun.springribbon.bean.TestBean;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements FeignClient{

    @Override
    public String test(TestBean testBean) {
        return "this is Hystrix";
    }
}
