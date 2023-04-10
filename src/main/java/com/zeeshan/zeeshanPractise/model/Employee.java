package com.zeeshan.zeeshanPractise.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String userId;
    private String username;
    private String mobileNumber;
    private String location;


}
