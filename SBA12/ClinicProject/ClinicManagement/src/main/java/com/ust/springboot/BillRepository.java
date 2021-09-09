package com.ust.springboot;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories

public interface BillRepository extends MongoRepository<Bill, String> {
	

}

