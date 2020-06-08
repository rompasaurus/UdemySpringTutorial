package com.UdemySpringTutorial.UdemySpringTutorial.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//Controller that will handle http requests
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {
    //Get
    //URI - /hello-world
    //Method to return "Hello World
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean("Hello nerd welcome " + name);
    }
}
