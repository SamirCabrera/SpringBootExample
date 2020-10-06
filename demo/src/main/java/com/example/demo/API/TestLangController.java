package com.example.demo.API;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLangController {
    @GetMapping("/test")
    public String Test(Locale locale) {
        ResourceBundle messages = ResourceBundle.getBundle("i18n\\messages", locale);

        return messages.getString("Main.Hello");
    }
}
