package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blog (Model model) {
        model.addAttribute("title", "title page");
        return "blog-main.html";  //указываем путь
    }
}
