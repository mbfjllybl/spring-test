package io.github.factorybean;

import io.github.mbfjllybl.User;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("QAQ");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}