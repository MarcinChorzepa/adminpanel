package com.adminportal.service;

import com.adminportal.domain.Book;

import java.util.List;

/**
 * Created by Marcin on 13.05.2017.
 */
public interface BookService {
    Book save(Book book);
    List<Book> findAll();
}
