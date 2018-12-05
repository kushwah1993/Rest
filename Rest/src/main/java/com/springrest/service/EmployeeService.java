package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springrest.model.Employee;

@Component
public class EmployeeService {

	@Autowired
	public Employee employee;
	
	List<Employee> list = new ArrayList<Employee>();
	
	public List<Employee> getEmployees(){
		
		return list;		
	}
	
	public Employee getEmployee(int empId){
		
		employee.setEmpId(empId);
		employee.setName("dasfjsdfs");	
		return employee;
		
	}
	
	public Employee createEmployee(Employee employee){
		
		employee.setEmpId(employee.getEmpId());
		employee.setName(employee.getName());	
		list.add(employee);
		return employee;
		
	}
	
	
}
