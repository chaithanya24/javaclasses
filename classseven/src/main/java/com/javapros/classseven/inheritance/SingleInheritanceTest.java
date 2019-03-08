package com.javapros.classseven.inheritance;

class SuperClass {
	
	void print() {
		System.out.println("Inside Superclass..");
	}
}

class SubClass extends SuperClass {
	
	void printOutput() {
		System.out.println("Inside Subclass");
	}
	
	@Override
	void print() {
		System.out.println("Overide Superclass...");;
	}
	
	void addTwo() {
		System.out.println("Addition...");
	}
}
public class SingleInheritanceTest {
	
	public static void main(String[] args) {
	
		SubClass subCLass = new SubClass();
		subCLass.print();
		subCLass.printOutput();
		
		SuperClass superClass = new SubClass();
		superClass.print();
		
		SuperClass superClass2 = new SuperClass();
		superClass2.print();
			
	}
}
