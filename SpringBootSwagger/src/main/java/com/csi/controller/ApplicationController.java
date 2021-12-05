package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @Autowired
    EmployeeServiceImpl employeeService;


    @GetMapping
    public String sayHello()
    {
       return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/fullstack")
    public String heyHello()
    {
        return "Welcome to Full stack";
    }

    @GetMapping("new")
    public String csiServices()
    {
        return "APPLICATION DEVELOPMENT";
    }

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.saveData(employee));
    }

    @GetMapping("/loaneligibility/{empId}")
    public ResponseEntity<Boolean> loanEligibility(@PathVariable int empId)
    {
        return ResponseEntity.ok(employeeService.loanEligibility(empId));
    }

}
