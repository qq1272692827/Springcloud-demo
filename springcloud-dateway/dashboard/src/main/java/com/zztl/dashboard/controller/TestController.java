package com.zztl.dashboard.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description 测试类
 * @date 2019/5/27
 */


@RestController
@RefreshScope
public class TestController {

    @Value("test.name")
    private String testName;

    @RequestMapping("/v1/test")
    public String test(){
        System.out.println(testName);
        return "testName:"+testName;
    }

}
