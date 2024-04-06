package com.GrowScanner.GrowScanner.repository;

import com.GrowScanner.GrowScanner.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {
    // You can add custom query methods here if needed
}

