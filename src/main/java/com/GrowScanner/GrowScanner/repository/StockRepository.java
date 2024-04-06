package com.GrowScanner.GrowScanner.repository;

import com.GrowScanner.GrowScanner.model.Stock;

import java.util.List;

import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {
   List<Stock> findAll();
}

