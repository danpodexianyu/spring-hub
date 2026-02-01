package org.request.params.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.request.params.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("gender") String gender,
                           @RequestParam("hobby") String[] hobbies,
                           @RequestParam("intro") String intro) {
        log.info("username: {}", username);
        log.info("password: {}", password);
        log.info("gender: {}", gender);
        log.info("hobbies: {}", Arrays.toString(hobbies));
        log.info("intro: {}", intro);
        return "OK";
    }

    @PostMapping("/registerByPojo")
    @ResponseBody
    public String registerByPojo(User user) {
        log.info("{}", user);
        return "OK";
    }

}
