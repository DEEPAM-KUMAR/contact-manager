package com.project.contactManager.contact_manager.controller;

import com.project.contactManager.contact_manager.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String homePageView(Model model){
        model.addAttribute("name","Deepam Kumar Gupta");
        model.addAttribute("college","NIT Jamshedpur");
        model.addAttribute("github_profile","https://github.com/DEEPAM-KUMAR");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPageView(Model model){
        return "about";
    }
    @RequestMapping("/service")
    public String servicePageView(Model model){
        return "services";
    }

    @GetMapping("/register")
    public String registerPage(Model model){
        UserForm userForm = new UserForm();
        userForm.setName("Deepam");
        model.addAttribute("userForm",userForm);
        return "register";
    }


    @RequestMapping(value = "/do-register",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute UserForm userForm){
        System.out.println(userForm);
        return "redirect:/register";
    }
}
