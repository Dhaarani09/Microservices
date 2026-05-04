package com.company.controller;

import com.company.domain.Employee;
import com.company.service.EmployeeRegisterationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeRegisterationController {

    @Autowired
    private EmployeeRegisterationProducer employeeRegisterationProducer;

    @PostMapping("/register")
    public String orderFood(@RequestBody Employee employee){
        employeeRegisterationProducer.sendMessage(employee);
        return "Message was sent successfully";
    }
}
