package com.example.Tkrproject.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Tkrproject.model.Employee;
import com.example.Tkrproject.service.EmpServices;
@RestController
@RequestMapping("/addemp")

public class EmpController {
	@Autowired
	EmpServices es;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return es.addEmp(emp);
	}
	@GetMapping("/retrivaldata")
	public List<Employee> getEmployee()
	{
		return es.getEmp();
	}
	@DeleteMapping("/deletingrecord/{eid}")
	public void deleteEmp(@PathVariable int eid)
	{
		es.delEmp(eid);
	}
	

}
