package io.github.test;

import io.github.mbfjllybl.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println("QAQ");
        user.add();

    }
}
