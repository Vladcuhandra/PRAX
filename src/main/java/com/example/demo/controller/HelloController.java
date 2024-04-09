package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller           // @Controller возврощает ХТМЛ страницы :: @RestController возврощает string строки::


public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "main page");
        return "home.html";  //указываем путь
    }

    @GetMapping("/about")
    public String about (Model model) {
        model.addAttribute("title", "about page");
        return "about.html";  //указываем путь
    }


}