package com.el.ally.invoicify.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.ally.invoicify.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	 User findByUsername(String username);

}
