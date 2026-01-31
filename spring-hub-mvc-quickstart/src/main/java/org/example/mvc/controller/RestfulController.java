package org.example.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/users")
public class RestfulController {

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String create() {
        return "user:create";
    }

    // @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @GetMapping("/{userId}")
    public String getById(@PathVariable("userId") Long userId) {
        return "user:query";
    }

    // @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @DeleteMapping("/{userId}")
    public String delete(@PathVariable("userId") Long userId) {
        return "user:delete";
    }

    // @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update() {
        return "user:update";
    }
}
