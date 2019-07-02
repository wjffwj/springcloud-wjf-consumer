package com.wjf.controller;

import com.wjf.service.RemoteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created by 24745
 * @date 2019/7/2
 */
@RestController
public class TestController {
    @Autowired
    private RemoteTestService remoteTestService;
    @RequestMapping("/hello")
    public String request(){
        String str = remoteTestService.getHiFromRequest("str");
        return  str;
    }
}
