package com.example.tea.mapper;

import com.example.tea.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    void insert(Employee employee);
    void delete(int id);
    void update(Employee employee);
    List<Employee> select();
}
