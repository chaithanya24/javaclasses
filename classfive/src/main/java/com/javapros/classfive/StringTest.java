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
	}

}
