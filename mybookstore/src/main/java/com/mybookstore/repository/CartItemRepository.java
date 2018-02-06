package com.mybookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.CartItem;
import com.mybookstore.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
