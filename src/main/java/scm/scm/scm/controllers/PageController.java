package scm.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/home")
    public String page(Model model){
        System.out.println("home page running");
        model.addAttribute("name","Rashed");
        model.addAttribute("age","21");
        model.addAttribute("phone","+8801827801715");
        model.addAttribute("link","https://rarashed.github.io");
        return "home";
    }
}
