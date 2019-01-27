package com.javapros.classfive;

public class StringTest {

	public static void main(String[] args) {
		
		//Using literal.
		String name = "chaithanya";
		String name1 = "chaithanya";
		
		String murali = new String("Murali").intern();
		String murali1 = new String("Murali").intern();
		
		
		if(name == name1) {
			System.out.println("references are equal");
		}
		
		if(name.equals(name1)) {
			System.out.println("values are equls");
		}

		
		
		if(murali == murali1) {
			System.out.println("references are equal");
		}
		
		if(murali.equals(murali1)) {
			System.out.println("values are equls");
		}
		
		// Immutable:
		
		name = name + "murali";
		
		String newName = "chaithanyamurali";
		
		System.out.println("name:" +name);
		
		StringBuilder builder = new StringBuilder();
		builder.append("chaithanya");
		builder.append("Murali");
		
		System.out.println("String builder::"+builder.toString());
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello....");
		
		System.out.println("String buffer::" +buffer.toString());
		
		String hello = "hello world..!";
		
		System.out.println(hello.length());
		System.out.println(hello.substring(0, 5));
		System.out.println(hello.concat("adding more...!"));
		
		int intVal = 30;
		
		String strVal = Integer.toString(intVal);
		
		System.out.println("str value:" +strVal);
		
		int newVal = Integer.parseInt(strVal);
		
		System.out.println("result value::" +newVal);
		
		//Create two string literal/ using constructor, then perform all the ~45 string methods on the string values.
		// Different ways to convert string -> int/float etc vice versa.
	}

}
