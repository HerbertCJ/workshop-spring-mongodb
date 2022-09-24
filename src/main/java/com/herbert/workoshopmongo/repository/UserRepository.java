package com.herbert.workoshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.herbert.workoshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
