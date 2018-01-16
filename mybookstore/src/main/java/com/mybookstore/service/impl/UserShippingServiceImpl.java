package com.mybookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybookstore.domain.UserShipping;
import com.mybookstore.repository.UserShippingRepository;
import com.mybookstore.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userShippingRepository.delete(id);
	}

}
