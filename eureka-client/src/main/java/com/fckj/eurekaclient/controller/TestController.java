package com.fckj.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: huangpingan
 * @Date: 2019-08-13 10:30
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String toString() {
        return "这是端口为："+port+"实例项目";
    }

}
