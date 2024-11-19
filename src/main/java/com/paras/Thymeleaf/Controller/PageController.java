package com.paras.Thymeleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PageController {

    @GetMapping("/about")
    public String greet(Model model){
        model.addAttribute("login",true);
        model.addAttribute("title","Welcome to About Page");
        model.addAttribute("gitHub","https://github.com/paras-b4");
        model.addAttribute("name","paras yadav");
        model.addAttribute("subject","Java");

        return "/about";

    }

}
