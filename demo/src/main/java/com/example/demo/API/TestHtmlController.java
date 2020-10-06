package com.example.demo.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestHtmlController {
    @GetMapping("/testHtml")
    public String Test() {
        return "testMessage";
    }
}
