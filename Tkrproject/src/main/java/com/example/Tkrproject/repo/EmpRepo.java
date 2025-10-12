package com.example.Tkrproject.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Tkrproject.model.Employee;


public interface EmpRepo extends JpaRepository<Employee,Integer>{



}
