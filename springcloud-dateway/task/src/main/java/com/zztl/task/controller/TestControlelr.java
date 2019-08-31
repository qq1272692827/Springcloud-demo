package com.zztl.task.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description 测试
 * @date 2019/1/17
 */
@RestController
public class TestControlelr {

    @Value("test.name")
    String testName;
    @RequestMapping("/test")
    public String test(){

        return "success:"+testName;
    }

}
