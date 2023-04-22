package com.example.springbootaop.targetObjectCaller;

import com.example.springbootaop.aopTarget.AopTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetCaller {
    @Autowired
    private AopTarget aopTarget;

    public void callTargetMethod() {
        aopTarget.targetMethod();
    }

}
