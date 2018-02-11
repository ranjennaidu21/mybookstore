package com.mybookstore.service;

import com.mybookstore.domain.ShippingAddress;
import com.mybookstore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
