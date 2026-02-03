package org.example.ajax.controller;

import org.example.ajax.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    /*@GetMapping("/ajax")
    public void getMessage(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("Hello AJAX");
    }*/

    @GetMapping("/ajax")
    @ResponseBody
    public User ajax() {
        return new User(1L, "张三");
    }

}
