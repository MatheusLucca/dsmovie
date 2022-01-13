package com.matheuslucca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslucca.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
