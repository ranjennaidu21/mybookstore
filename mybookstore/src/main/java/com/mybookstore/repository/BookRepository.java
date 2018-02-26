package com.mybookstore.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByCategory(String category);
	
	List<Book> findByTitleContaining(String title);
}
