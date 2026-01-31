package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.mvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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

    @RequestMapping("/arrayParams")
    @ResponseBody
    public String arrayParams(@RequestParam("likes") String[] likes) {
        log.info("{}", Arrays.toString(likes));
        return Arrays.toString(likes);
    }

    @RequestMapping("/listParams")
    @ResponseBody
    public String listParams(@RequestParam("likes") List<String> likes) {
        return likes.toString();
    }


    // json params
    @RequestMapping("/jsonListParams")
    @ResponseBody
    public String jsonListParams(@RequestBody List<String> likes) {
        return likes.toString();
    }

    @RequestMapping("/pojoParamsForJson")
    @ResponseBody
    public String pojoParamsForJson(@RequestBody User user) {
        return user.toString();
    }

    @RequestMapping("/dates")
    @ResponseBody
    public String date(@RequestParam("date1") LocalDate date1,
                       @RequestParam("date2") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date2,
                       @RequestParam("date3") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date3) {
        log.info("yyyy/MM/dd: {}", date1);
        log.info("yyyy-MM-dd: {}", date2);
        log.info("yyyy-MM-dd: {}", date3);
        return "OK";
    }
}
