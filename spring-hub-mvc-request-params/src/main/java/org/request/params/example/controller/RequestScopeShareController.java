package org.request.params.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("message", "Request scope sharing via Map");
        return "request-scope-share";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.put("message", "Request scope sharing via ModelMap");
        return "request-scope-share";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        /*
         * 注意：
         * 1. 方法的返回值类型不是String，而是ModelAndView对象
         * 2. ModelAndView对象是通过new创建的
         * 3. 需要调用addObject方法向域中存储数据
         * 4. 需要调用setViewName方法设置视图的名字
         * */
        // 创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        // 绑定数据
        modelAndView.addObject("message", "ModelAndView");
        // 绑定视图
        modelAndView.setViewName("request-scope-share");
        // 返回
        return modelAndView;
    }

}
