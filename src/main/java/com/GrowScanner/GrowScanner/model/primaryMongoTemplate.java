package com.GrowScanner.GrowScanner.model;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class primaryMongoTemplate {

	abstract MongoTemplate primaryMongoTemplate();

}
