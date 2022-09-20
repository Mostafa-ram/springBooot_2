package com.example.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.company.entity.Employee;
import com.example.company.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/showEmployess", "/", "/list"})
	public ModelAndView showEmployees() {
		
		ModelAndView mav = new ModelAndView("list-employees");
		List<Employee> list = eRepo.findAll();
		mav.addObject("employees",list);
		return mav;
	}
	
}
