package com.LearnTechie.springbootmongodb.repository;

import com.LearnTechie.springbootmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense,String> {
}
