package io.github.aoptest;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class UserProxy {
    public void add() {
        // int x = 1 / 0;
        System.out.println("somethings");
    }
}
