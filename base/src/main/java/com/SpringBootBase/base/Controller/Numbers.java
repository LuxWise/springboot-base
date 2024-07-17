package com.SpringBootBase.base.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class Numbers {
    @GetMapping("/number")
    public Integer number() {
        return 1610;
    }
}
