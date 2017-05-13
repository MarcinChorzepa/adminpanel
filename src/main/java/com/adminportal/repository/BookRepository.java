package com.adminportal.repository;

import com.adminportal.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Marcin on 13.05.2017.
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
