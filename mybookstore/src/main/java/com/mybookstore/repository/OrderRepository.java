package com.mybookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
