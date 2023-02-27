package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/")
    public String showPage(Model model){
        model.addAttribute("message", "Oh yeah!");
        return "hello_world";
    }

//    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
//    public String printHelloWorld(ModelMap modelMap) {
//        modelMap.addAttribute("message", "Hello World and Welcome to Spring MVC");
//
//        return "hello_world";
//    }
}
