package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        log.info("Hello World");
        return "{'greeting': 'Hello World'}";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("name") String name) {
        log.info("{}", name);
        return "{\"greeting\": \"Hello World\"}";
    }
}
