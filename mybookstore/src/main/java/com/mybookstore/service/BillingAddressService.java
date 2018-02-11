package com.mybookstore.service;

import com.mybookstore.domain.BillingAddress;
import com.mybookstore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
