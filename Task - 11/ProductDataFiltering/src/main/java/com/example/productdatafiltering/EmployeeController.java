package com.example.mongodbrestapi.controller;

import com.example.mongodbrestapi.model.Employee;
import com.example.mongodbrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Landing page to display the form
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Save employee details
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/displayAll";
    }

    // Display all employees
    @GetMapping("/displayAll")
    @ResponseBody
    public List<Employee> displayAll() {
        return employeeRepository.findAll();
    }

    // Display a specific employee by ID
    @GetMapping("/display/{id}")
    @ResponseBody
    public Employee displayById(@PathVariable String id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
