package com.javapros.classnine.basics;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.Vector;

public class Basics {

	public static void main(String[] args) {
		
		//Vector
		Vector<String> names = new Vector<String>();
		names.add("Mark");
		names.add("Mike");
		names.add("Om");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		for (String name : names) {
			System.out.println("Name::" + name);
		}
		
		//Stack.
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.add(500);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		for (Integer element : stack) {
			System.out.println(element);
		}
		stack.push(600);
		System.out.println(stack.size());
		
		//HashTable.
		Hashtable<String, Integer> ageMap = new Hashtable<String, Integer>();
		ageMap.put("Chaithanya", 29);
		ageMap.put("Murali", 30);
		
		System.out.println("age: "+ageMap.get("Chaithanya"));
		System.out.println("age: "+ageMap.get("Murali"));
		
		for(Entry<String, Integer> map: ageMap.entrySet()) {
			System.out.println(map.getKey()+" and "+map.getValue());
		}
		
	}

}
