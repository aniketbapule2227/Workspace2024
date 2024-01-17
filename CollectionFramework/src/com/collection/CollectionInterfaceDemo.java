package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {
	
	public static void main(String[] args) {
		
		Collection <Integer>c= new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		boolean answer=c.remove(2);
		System.out.println(answer);
		
		for(Integer i : c) {
			System.out.println(" "+i);
			
		}
		
		
	}

}
