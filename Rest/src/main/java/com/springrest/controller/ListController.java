package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springrest.model.Employee;
import com.springrest.service.EmployeeService;

@RestController
@RequestMapping("/apis")
public class ListController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@RequestMapping(value = "/employees/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
		
	}
	
	@RequestMapping(value = "/employees/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String name, @RequestParam String password) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("welcome");
		return mv;
		
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {		
		
		return employeeService.getEmployees();
	}
	
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int empId) {		
		
		return employeeService.getEmployee(empId);
	}
	
	@RequestMapping(value = "/employees/create", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
		
	}
	
	
}
