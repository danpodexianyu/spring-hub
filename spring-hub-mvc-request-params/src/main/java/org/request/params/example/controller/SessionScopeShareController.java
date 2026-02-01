package org.request.params.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/session")
@SessionAttributes(value = {"message"})
public class SessionScopeShareController {

    @RequestMapping("/testServlet")
    public String testServlet(HttpSession session) {
        session.setAttribute("message", "Native Servlet API");
        return "session-scope-share";
    }

    @RequestMapping("/testAnnotation")
    public String testAnnotation(ModelMap map) {
        map.put("message", "SessionAttributes Annotation");
        return "session-scope-share";
    }

}
