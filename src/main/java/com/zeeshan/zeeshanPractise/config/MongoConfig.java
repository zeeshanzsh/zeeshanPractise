package com.zeeshan.zeeshanPractise.config;

import com.zeeshan.zeeshanPractise.dao.EmployeeRepository;
import com.zeeshan.zeeshanPractise.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
//@Configuration
//public class MongoConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(EmployeeRepository userRepository) {
//        return strings -> {
//            userRepository.save(new Employee("1", "Zeeshan", "9738235628", "Hubli"));
//            userRepository.save(new Employee("2", "Zohan", "9738235628", "Hubli"));
//        };
//    }
//}
