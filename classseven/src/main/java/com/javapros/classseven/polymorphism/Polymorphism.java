package com.javapros.classseven.polymorphism;

public class Polymorphism {

	class SuperClass {
		
		void print() {
			System.out.println("inside superclass print..");
		}
		
		protected SuperReturn returnMethod() {
			SuperReturn superReturn = new SuperReturn();
			return superReturn;
		}
	}
	
	class SubClass extends SuperClass {
		void printSub() {
			System.out.println("inside subclass print...");
		}
		
		@Override
		void print() {
			System.out.println("Override superclass method");
		}
		
		@Override
		public SubReturn returnMethod() {
			SubReturn subReturn = new SubReturn();
			return subReturn;
		}
		
		void add() {
			System.out.println("add with zero args..");
		}
		
		void add(int a) {
			System.out.println("add with one arg..");
		}
		
		int add(int a, int b) {
			System.out.println("Add with two args..");
			return 1;
		}
		
	}
	
	class SuperReturn {
		
	}
	
	class SubReturn extends SuperReturn {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
