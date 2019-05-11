package com.javapros.classnine.list;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		
		//ArrayList.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Murali");
		names.add("Chaithanya");
		names.add("Veronica");
		names.add(1, "Nikki");
		
		names.add(null);
		names.add(null);
		
		ArrayList<String> names1 = new ArrayList<String>();
		
		//names1
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println(names.size());

	}

}
