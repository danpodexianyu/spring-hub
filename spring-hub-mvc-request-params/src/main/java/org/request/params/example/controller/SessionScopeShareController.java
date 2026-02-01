package org.request.params.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session")
public class SessionScopeShareController {

    @RequestMapping("/testServlet")
    public String testServlet(HttpSession session) {
        session.setAttribute("message", "Native Servlet API");
        return "session-scope-share";
    }

}
