package com.GrowScanner.GrowScanner.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = 
"com.GrowScanner.GrowScanner.repository",
    mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {

}
