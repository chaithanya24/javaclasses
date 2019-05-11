package com.javapros.classnine.basics;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		
		Vector<String> months = new Vector<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		
		Enumeration<String> en = months.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		

	}

}
