package com.example.springbootaop;

import com.example.springbootaop.aopTarget.AopTarget;
import com.example.springbootaop.targetObjectCaller.TargetCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerAop implements ApplicationRunner {
    @Autowired
    private AopTarget aopTarget;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        aopTarget.targetMethod();
    }
}
