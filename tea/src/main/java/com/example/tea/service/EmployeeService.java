package com.example.tea.service;

import com.example.tea.mapper.EmployeeMapper;
import com.example.tea.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

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

    public String list(Model model) {
        List<Employee> employees = employeeMapper.select();
        model.addAttribute("employees", employees);
        return "index";
    }
}
