package com.waterlufei.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiabin on 2017/8/8.
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String  test(){
        return "haha";
    }
}
