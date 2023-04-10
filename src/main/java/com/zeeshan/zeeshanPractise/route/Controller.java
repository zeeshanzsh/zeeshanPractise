package com.zeeshan.zeeshanPractise.route;

import com.zeeshan.zeeshanPractise.dao.EmployeeRepository;
import com.zeeshan.zeeshanPractise.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class Controller {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index(){
        log.info("Get call");
        return "Hello welcome to Zeeshan Application!!";
    }
    @GetMapping("/users")
    public List<Employee> users(){
        log.info("Get call");
        return employeeRepository.findAll();
    }

    @PostMapping("/user")
    public Employee user(@RequestBody Employee employee){

        return employeeRepository.save(employee);
    }



}
