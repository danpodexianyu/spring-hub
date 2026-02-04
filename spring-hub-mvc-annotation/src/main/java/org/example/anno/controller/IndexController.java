package org.example.anno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "test interceptor";
    }

}
