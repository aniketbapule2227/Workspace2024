package com.objectmapperdemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		
		
		//to serialize Java object to Json string.
		//Employee employee = new Employee(1, "Aniket", "Nanded", "Java Developer", "IT");
		//objectMapper.writeValue(new File("target/emp.json"), employee);
		

		
		// To deserialize Json string to Java object.
		String employeeJson="{\"id\":1,\"name\":\"Aniket\",\"city\":\"Nanded\",\"designation\":\"JavaDeveloper\",\"department\":\"IT\"}";
//		Employee employee=objectMapper.readValue(employeeJson, Employee.class);
//		
//		System.out.println(employee.toString());
//		
//		
		//if want to retirve particular data from json string 
		
		JsonNode jsonnode= objectMapper.readTree(employeeJson);
		
		String employeeName=jsonnode.get("name").asText();
		String employeeDepartment=jsonnode.get("department").asText();
		
		objectMapper.writeValue(new File("target/emp.txt"),employeeName+","+employeeDepartment);
		
	}
}