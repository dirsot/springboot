package com.example.greatagain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "Test 1";
    }

}