package com.project.contactManager.contact_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String homePageView(Model model){
        model.addAttribute("name","Deepam Kumar Gupta");
        model.addAttribute("college","NIT Jamshedpur");
        model.addAttribute("github_profile","https://github.com/DEEPAM-KUMAR");
        return "home";
    }
}
