package com.example.testij;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getname()
    {
        return "pradeep bhati Ashim usmani";
    }
    //a1
}
