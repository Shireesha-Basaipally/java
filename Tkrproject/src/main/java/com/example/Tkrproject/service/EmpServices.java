package com.example.Tkrproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tkrproject.model.Employee;
import com.example.Tkrproject.repo.EmpRepo;

@Service

public class EmpServices {
	@Autowired
	EmpRepo es;
	
	//insert
	public Employee addEmp(Employee emp)
	{
		return es.save(emp);
	}
	//select
	public List<Employee> getEmp()
	{
		return es.findAll();
	}
	//delete
	public void delEmp(int eid)
	{
		es.deleteById(eid);
	}

}
