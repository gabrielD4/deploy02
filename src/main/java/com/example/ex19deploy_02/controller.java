package com.example.ex19deploy_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sums")
public class controller {

    @Autowired
    private Service service;

    @GetMapping
    public int sum(@RequestParam int a, @RequestParam int b) {
        return service.sum(a, b);
    }
}
