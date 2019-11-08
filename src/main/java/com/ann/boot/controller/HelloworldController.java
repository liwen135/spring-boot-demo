package com.ann.boot.controller;

import com.ann.boot.config.annotation.MyFunction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {

    @RequestMapping("/sayhello.html")
    @ResponseBody
    @MyFunction
    public String say(String name) {
        return "hello " + name;
    }
}
