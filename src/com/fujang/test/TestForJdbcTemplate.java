package com.fujang.test;

import com.fujang.entity.Book;
import com.fujang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForJdbcTemplate {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanForDruidByProp.xml");
        BookService bookService = (BookService)context.getBean("bookService");
        Book book = new Book("8", "h11ahah", "hiah11iahia");
        bookService.addBook(book);
    }
}
