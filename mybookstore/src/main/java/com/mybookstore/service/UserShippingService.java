package com.mybookstore.service;

import com.mybookstore.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
