package com.greglturnquist.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@Autowired
	private EmployeeRepository repository;
	


	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}

}

