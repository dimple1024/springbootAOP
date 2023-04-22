package com.example.springbootaop.aopTarget;

import org.springframework.stereotype.Component;

@Component
public class AopTarget {

    public void targetMethod() {
        System.out.println("Executing method=targetMethod");
    }

}
