package com.example.mongodbrestapi.repository;

import com.example.mongodbrestapi.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
