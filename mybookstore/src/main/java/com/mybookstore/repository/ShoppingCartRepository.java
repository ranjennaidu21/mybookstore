package com.mybookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
