package com.myblog.MyBlog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blogs")
    public String blogs(Model model) {
        model.addAttribute("name", "Тут будут блоги");
        return "blogs";
    }
}
