package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/users")
public class RestfulController {

    @RequestMapping(method = RequestMethod.POST)
    public String create() {
        return "user:create";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String getById(@PathVariable("userId") Long userId) {
        return "user:query";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("userId") Long userId) {
        return "user:delete";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update() {
        return "user:update";
    }
}
