package io.github.mbfjllybl2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Newer {
    @Autowired
    @Qualifier("lecture")
    public Lecture lecture;

    @Value("hahaha")
    public String name;

}
