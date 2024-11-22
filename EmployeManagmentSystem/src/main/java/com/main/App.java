package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.controler.EmployeeController;
import com.model.Employee;

public class App {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeController empco=cxt.getBean(EmployeeController.class);
		 Employee emp = new Employee();
	        emp.setId("1");
	        emp.setName("John Doe");
	        emp.setDepartment("Engineering");
	        
	        empco.addEmployee(emp);
	        Employee retrievedEmp = empco.getEmployeeById("1");

	        System.out.println(retrievedEmp);
		cxt.close();
	}

}
