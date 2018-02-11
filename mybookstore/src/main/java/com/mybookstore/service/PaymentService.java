package com.mybookstore.service;

import com.mybookstore.domain.Payment;
import com.mybookstore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
