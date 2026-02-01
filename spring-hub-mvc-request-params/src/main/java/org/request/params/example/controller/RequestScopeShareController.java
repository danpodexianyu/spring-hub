package org.request.params.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestScopeShareController {

    @RequestMapping("/servletApiRequestShare")
    public String servletApiRequestShare(HttpServletRequest request) {
        // 将共享的数据存储到 request 域中
        request.setAttribute("message", "在SpringMVC中使用原生Servlet API完成request域数据共享");

        // 跳转视图，在视图中将存储到 request 域中的共享数据取出来，这样就实现了，Controller和View在同一个请求中两个组件之间的数据共享
        return "request-scope-share";
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("message", "Request scope sharing via Model");
        return "request-scope-share";
    }

}
