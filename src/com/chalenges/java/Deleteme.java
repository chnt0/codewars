package com.chalenges.java;

import java.util.ArrayList;
import java.util.List;

public class Deleteme {

	 public static void main(String[] args) {
		 
		 
		 List<Integer> jump= new ArrayList<>();
		 jump.add(1);
		 jump.add(1);
		 jump.add(2);
		 Integer a= jump.stream().mapToInt(t->t).max().orElse(0);
		 System.out.println(a);
	 }
}

		 
	    
	/*public static void main(String[] args) {
		String  n="Cuenta cada palabra cuenta bien";
		
		Map<String, Long> map= new HashMap<>();
		
		
		
		
		Stream.of(n.toLowerCase().split(" ")).forEach(b->
				map.put(b, Stream.of(n.split(" ")).filter(c->c.equalsIgnoreCase(b)).count())
				);
		
		map.forEach((key,val)-> System.out.println(key +"   "+ val));
			
		
		
		
	}*/
	
