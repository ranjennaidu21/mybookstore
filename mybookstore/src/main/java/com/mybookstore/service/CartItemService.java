package com.mybookstore.service;

import java.util.List;

import com.mybookstore.domain.CartItem;
import com.mybookstore.domain.ShoppingCart;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
}
