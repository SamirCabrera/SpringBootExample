package com.example.demo.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestHtmlController {
    @GetMapping("/testHtml")
    public String Test() {
        return "testMessage";
    }

    @GetMapping("/test2Html")
    public String Test2() {
        return "test2"; 
    }

    @GetMapping("/test3Html")
    public String Test3() {
        return "test3";
    }
}
