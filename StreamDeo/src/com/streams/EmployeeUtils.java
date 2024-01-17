package com.streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtils {
	
	
	public static List<Employee> employeeList(){
	Address homeaddress= new Address("Nanded","MH","431079");
	Address officeaddress= new Address("Pune","MH","411041");
	
	
	Employee employee1= new Employee("aniket","Bapule",Arrays.asList(homeaddress,officeaddress));
	Employee employee2= new Employee("abhi","Bapule",Arrays.asList(homeaddress,officeaddress));
	Employee employee3= new Employee("dhanu","Bapule",Arrays.asList(homeaddress,officeaddress));
	Employee employee4= new Employee("anuja","Bapule",Arrays.asList(homeaddress,officeaddress));
	Employee employee5= new Employee("sneha","Bapule",Arrays.asList(homeaddress,officeaddress));
	Employee employee6= new Employee("shiu","Bapule",Arrays.asList(homeaddress,officeaddress));
	
		

		return Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);
		
		
		
		
	}

}
