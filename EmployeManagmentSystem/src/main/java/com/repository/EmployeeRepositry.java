package com.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeRepositry {
	private Map<String, Employee> database=new HashMap<>();

	public void save(Employee emp)
	{
		database.put(emp.getId(), emp);
	}
	
	public Employee findId(String id)
	{
		return database.get(id);
	}
	
	

}
