package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List list= new ArrayList<>();
		list.add("Aniket");
		list.add("abhishek");
		list.add("dhnaraj");
		list.add("anuja");
		
		Stream stream=list.stream();
		
//		stream.filter(l -> l!=null)
//				.forEach(e ->System.out.println(e));
		
		
	}

}
