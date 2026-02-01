package org.request.mapping.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/detail")
    public String getDetail() {
        return "product/detail";
    }

}
