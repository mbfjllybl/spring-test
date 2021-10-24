package com.fujang.dao;

import com.fujang.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
    //添加的方法
    public void add(Book book);
}
