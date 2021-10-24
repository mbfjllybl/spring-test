package io.github.test;

import io.github.aoptest.UserProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForAOP {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOPBean.xml");
        UserProxy userProxy = (UserProxy)context.getBean("userProxy");
        //System.out.println(userProxy);
        userProxy.add();
    }
}
