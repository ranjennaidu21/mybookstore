package com.mybookstore.service;

import com.mybookstore.domain.BillingAddress;
import com.mybookstore.domain.Order;
import com.mybookstore.domain.Payment;
import com.mybookstore.domain.ShippingAddress;
import com.mybookstore.domain.ShoppingCart;
import com.mybookstore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
