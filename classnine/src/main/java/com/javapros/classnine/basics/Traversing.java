package com.javapros.classnine.basics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Traversing {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<String>();
		names.add("Mark");
		names.add("Mike");
		names.add("Om");
		
		
		//Using Enumeration:
		Enumeration<String> en = names.elements();
		while(en.hasMoreElements()) {
			System.out.println("elements::" +en.nextElement());
		}
		
		Iterator<String> it = names.iterator();
		
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println("elements using iterator:" +string);
			it.remove();	
		}
		//Prints no elements as we removed all the elements.
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println("elements using iterator:" +string);	
		}
		
		// create a new vector of type Integer.
		//Assignment: use hasPrevious() and other methods.
		
		names.add("Chaithanya");
		names.add("Murali");
		names.add("Veronica");
		
		ListIterator<String> listIt = names.listIterator();
		
		// using iterator you can remove dynamically /list iterator you can add, remove or modify.
		while (listIt.hasNext()) {
			String string = (String) listIt.next();
			System.out.println(string);
			listIt.add("Nikki");
		}
		
		//throws an exception (ConcurrentModificationException), as we can't modify the collection inside a loop.
		for(String name: names) {
			System.out.println(name);
			names.add("one more name");
		}
		
	}

}
