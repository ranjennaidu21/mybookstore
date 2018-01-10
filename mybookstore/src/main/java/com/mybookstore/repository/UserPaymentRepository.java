package com.mybookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
