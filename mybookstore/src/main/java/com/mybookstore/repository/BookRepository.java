package com.mybookstore.repository;


import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
