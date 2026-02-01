package org.request.mapping.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/detail")
    public String getDetail() {
        return "user/detail";
    }

    @PostMapping("/login")
    public String login() {
        return "user/detail";
    }
}
