package org.example.ajax.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.ajax.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@Slf4j
@RestController
public class AjaxController {

    /*@GetMapping("/ajax")
    public void getMessage(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("Hello AJAX");
    }*/

    @GetMapping("/ajax")
    // @ResponseBody
    public User ajax() {
        return new User(1L, "张三");
    }

    @PostMapping("/users")
    public String save(@RequestBody User user) {
        log.info("{}", user);
        return "ok";
    }

}
