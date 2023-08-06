package com.example.tea.controller;

import com.example.tea.mapper.EmployeeMapper;
import com.example.tea.pojo.Employee;
import com.example.tea.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    void insert(Employee employee) {

    };
    void delete(int id) {

    };
    void update(Employee employee) {

    };
    List<Employee> select() {
        List<Employee> employees;

        return null;
    };

    @RequestMapping("index")
    public String list(Model model) {
        return employeeService.list(model);
    }
}