package com.streams;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		List<Employee> employee=EmployeeUtils.employeeList();
		
		//create a stream object.
		Stream<Employee> employeestream=employee.stream();
		
		//employeestream.forEach(s-> System.out.println(s));
		
		// to find perticular field from stream we use map() function.
//		employeestream.map(emp-> emp.getFname())
//						.forEach(emp->System.out.println(emp));
	
	
	// when we want to retrive data based on filter like city, name we user filter()method.
//		
	List<Employee> employee2=employeestream.filter(c-> c.getAddress().stream().anyMatch(adress->adress.getCity().equals("Nanded")))
				.collect(Collectors.toList());
													
	
	for(Employee employee1 :employee2) {
		System.out.println(employee1);
	}
	
	
	
	
	
	
	
	}

}
