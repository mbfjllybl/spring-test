package io.github.test;

import io.github.mbfjllybl.BookStore;
import io.github.mbfjllybl.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testUser() {
        // BeanFactory
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user3");
        System.out.println(user);
        user.add();

    }

    @Test
    public void testBookStore() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookStore bookStore = (BookStore)context.getBean("bookStore1");
        System.out.println(bookStore);
    }

    @Test
    public void testMyBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("myBean");
        System.out.println(user);
    }
}
