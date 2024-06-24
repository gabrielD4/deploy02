package com.example.ex19deploy_02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Value("${integerProperties.a}")
    private Integer a;

    @Value("${integerProperties.b}")
    private Integer b;

    public int sum () {
        return a + b;
    }
}
