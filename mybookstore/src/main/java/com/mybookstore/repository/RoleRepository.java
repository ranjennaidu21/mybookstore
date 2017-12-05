package com.mybookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.mybookstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
