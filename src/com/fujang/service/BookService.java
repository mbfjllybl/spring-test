package com.fujang.service;

import com.fujang.dao.BookDao;
import com.fujang.dao.BookDaoImpl;
import com.fujang.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //add
    public void addBook(Book book) {
        bookDao.add(book);
    }
}
