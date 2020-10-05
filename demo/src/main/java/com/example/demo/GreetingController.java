package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String HtmlGreetings(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("name", name);
        return "greeting";       
    }

    @GetMapping("/greeting2")
    public String HtmlGreetings2(@RequestParam(name="text1") String text1, @RequestParam(name="text2") String text2, Model model) {
        
        model.addAttribute("text1", text1);
        model.addAttribute("text2", text2);

        return "greeting2";       
    }
}


