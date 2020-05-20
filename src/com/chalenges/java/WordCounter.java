package com.chalenges.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WordCounter {


		 
	    
	public static void main(String[] args) {
		String  n="Cuenta cada palabra cuenta bien, Cuenta todas Cada ves";
		
		Map<String, Long> map= new HashMap();//contain the result
		
		Stream.of(n.toLowerCase().split(" ")).forEach(b->
				map.put(b, Stream.of(n.split(" ")).filter(c->c.equalsIgnoreCase(b)).count())
				);
		
		map.forEach((key,val)-> System.out.println(key +"   "+ val));
			
		
		
		
	}
}
