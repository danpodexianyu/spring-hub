package org.example.ajax.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class AjaxController {

    @GetMapping("/ajax")
    public void getMessage(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("Hello AJAX");
    }

}
