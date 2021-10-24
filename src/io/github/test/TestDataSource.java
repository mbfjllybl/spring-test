package io.github.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestDataSource {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanForDruid.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanForDruidByProp.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
