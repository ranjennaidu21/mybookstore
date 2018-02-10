package com.mybookstore.service;

import java.util.List;

import com.mybookstore.domain.Book;
import com.mybookstore.domain.CartItem;
import com.mybookstore.domain.ShoppingCart;
import com.mybookstore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
}
