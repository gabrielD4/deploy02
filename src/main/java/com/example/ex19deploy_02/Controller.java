package com.example.ex19deploy_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sums")
public class Controller {

    @Autowired
    private MathService mathService;

    @GetMapping
    public int sum() {
        return mathService.sum();
    }
}
