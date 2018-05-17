package com.javier.queriesandjoins;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service 
public class EmployeeService {
	private final EmployeeRepo er;
	
	public EmployeeService(EmployeeRepo er) {
		this.er=er;
	}
	
	
	public void test() {
		
		Employee manager1 = new Employee("Javier", "Villalobos");
		Employee emp1 = new Employee("Marco", "Hernandez");
		Employee emp2 = new Employee("Juan", "Solis");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		manager1.setEmployees(employees);
		emp1.setManager(manager1);
		emp2.setManager(manager1);
		er.save(manager1); 
		er.save(emp1);
		er.save(emp2);
		for(Employee e: manager1.getEmployees() )	
			System.out.println(e.getFirstName());
	}
}
