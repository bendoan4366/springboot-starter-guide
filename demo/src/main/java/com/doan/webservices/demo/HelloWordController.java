package com.doan.webservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWordController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "ay ay!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("ay ay ay!", "Duke Deuce");
    }
}
