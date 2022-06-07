package org.encapsulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EncapslationMap {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Thiyagu");
		e1.setPhno(987654321);

		// E2 Method
		Employee e2 = new Employee();
		e2.setId(200);
		e2.setName("Rajan");
		e2.setPhno(123456789);

		// E3 Method
		Employee e3 = new Employee();
		e3.setId(300);
		e3.setName("Thiyagarajan");
		e3.setPhno(987651234);

		System.out.println("Using Map");
		System.out.println("-----------");
		

		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getPhno());
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getPhno());
		
		System.out.println(e3.getId());
		System.out.println(e3.getName());
		System.out.println(e3.getPhno());
		
		
		
	/*	Map<Integer, Employee> li = new LinkedHashMap<Integer, Employee>();
		li.put(1, e1);
		li.put(2, e2);
		li.put(3, e3);
		
		Set<Entry<Integer, Employee>> et = li.entrySet();
		
		for (Entry<Integer, Employee> c : et) {
			
			System.out.println(c.getKey());
			System.out.println(c.getValue().getId());
			System.out.println(c.getValue().getName());
			System.out.println(c.getValue().getPhno());
		}*/	
	}
}
