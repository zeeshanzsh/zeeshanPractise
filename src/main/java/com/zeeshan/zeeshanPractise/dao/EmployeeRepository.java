package com.zeeshan.zeeshanPractise.dao;

import com.zeeshan.zeeshanPractise.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
