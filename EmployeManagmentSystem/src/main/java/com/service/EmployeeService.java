package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepositry;

@Service
public class EmployeeService {
	
	private final EmployeeRepositry er;
	
	@Autowired
	public EmployeeService(EmployeeRepositry er)
	{
		this.er=er;
	}
	
	public void addEmployee(Employee emp)
	{
		er.save(emp);
	}
	
	public Employee findEmployeeById(String id)
	{
		return er.findId(id);
				
	}

}
