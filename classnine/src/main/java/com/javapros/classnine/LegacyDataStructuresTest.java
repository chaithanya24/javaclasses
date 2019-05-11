package com.javapros.classnine;

import java.util.BitSet;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class LegacyDataStructuresTest {

	public static void main(String[] args) {

		//1. Enumeration.
		Vector<String> names = new Vector<String>();
		names.add("chaithanya");
		names.add("murali");
		names.add("Niki");
		names.add("keerthi");
		
		//Enumeration is for traversing throgh the collection.
		
		Enumeration<String> en = names.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		//Assi: Create list/vector of months and print using Enumeration?
		
		//2. BitSet.
		
		BitSet set = new BitSet();
		set.set(2);
		set.set(5);
		set.set(9);
		set.set(10);
		
		System.out.println(set.size());
		for(int i =0; i< set.size(); i++) {
			System.out.println(set.get(i));
		}
		
		// Assi: print all the prime numbers for the given limit using bit set (seive Sundaram algorithm)?
		
		//3. Stack/Vector/HashTable will be coded after Collections.
		
		//4. Properties.
		
		Properties props = new Properties();
		props.put("hostname", "localhost:8080");
		props.put("username", "xxxxxxx");
		
		Enumeration propEnu = props.elements();
		while (propEnu.hasMoreElements()) {
			Object object = (Object) propEnu.nextElement();
		}
	}

}
