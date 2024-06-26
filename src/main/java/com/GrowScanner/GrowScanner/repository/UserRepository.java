package com.GrowScanner.GrowScanner.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.GrowScanner.GrowScanner.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // You can add custom query methods here if needed
	    Optional<User> findByEmail(String email);
	}


