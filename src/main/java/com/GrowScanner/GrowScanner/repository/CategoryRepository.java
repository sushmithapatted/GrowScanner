package com.GrowScanner.GrowScanner.repository;

import com.GrowScanner.GrowScanner.model.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    // You can add custom query methods here if needed
	
}

