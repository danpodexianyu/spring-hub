package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class FirstController {

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("test")
    public String hello() {
        return "first";
    }

    @RequestMapping("jumpToOtherView")
    public String jumpToOtherView() {
        return "other";
    }
}
