package com.mybookstore.service;

import java.util.List;

import com.mybookstore.domain.Book;
import com.mybookstore.domain.CartItem;
import com.mybookstore.domain.Order;
import com.mybookstore.domain.ShoppingCart;
import com.mybookstore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
