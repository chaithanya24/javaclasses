package com.javapros.classseven.inheritance;

public class MultipleInheritance {

	
	interface A {
		void printA();
	}
	
	interface B{
		void printB();
	}
	
	interface C extends A, B{
		void printC();
	}
	
	class AImpl implements C {

		@Override
		public void printC() {
			System.out.println("Inside AImpl, printC");	
		}

		@Override
		public void printB() {
			System.out.println("Inside AImpl, printB");	
		}

		@Override
		public void printA() {
			System.out.println("Inside AImpl, printA");	
		}
		
	}
	
	class BImpl implements A, B {

		@Override
		public void printA() {
			System.out.println("Inside BImpl, printA");
		}

		@Override
		public void printB() {
			System.out.println("Inside BImpl, printB");	
		}
		
	}
	//NOTE: Java does not support multiple inheritance when using class.
	
	public static void main(String[] args) {
		
		MultipleInheritance inheritance = new MultipleInheritance();
		AImpl impl = inheritance.new AImpl();
		
		impl.printA();
		impl.printB();
		impl.printC();
		
		B b = inheritance.new AImpl();
		b.printB();
		
		C c = inheritance.new AImpl();
		c.printA();
		c.printB();
		c.printC();
	}

}
