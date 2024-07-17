package com.SpringBootBase.base.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salutation")
public class SalutationClass {

    @GetMapping("/hello")
    public String helloWord() {
        return "Hello World!";
    }

    @GetMapping("/helloName/{name}/{age}")
    public String helloName(
            @PathVariable String name,
            @PathVariable Integer age) {
        return "Hello " + name + " your age is: " + age + "!";
    }
}
