package io.github.test;

import io.github.mbfjllybl2.Configration;
import io.github.mbfjllybl2.Lecture;
import io.github.mbfjllybl2.Newer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForMbfjllybl2 {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mbfjllybl2.xml");
        Lecture lecture = (Lecture)context.getBean("lecture");
        System.out.println(lecture);
        lecture.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configration.class);
        Newer newer = (Newer)context.getBean("newer");
        System.out.println(newer.name);
        newer.lecture.add();
    }
}
