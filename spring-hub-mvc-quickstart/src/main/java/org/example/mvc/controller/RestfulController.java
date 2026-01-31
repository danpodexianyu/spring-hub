package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class RestfulController {

    // creation
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String create() {
        // do something
        return "user:create";
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable("userId") Long userId) {
        return "user:query";
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("userId") Long userId) {
        return "user:delete";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update() {
        return "user:update";
    }
}
