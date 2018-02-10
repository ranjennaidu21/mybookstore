package com.mybookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.BookToCartItem;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

}
