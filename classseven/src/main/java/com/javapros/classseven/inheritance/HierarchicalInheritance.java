package com.javapros.classseven.inheritance;

public class HierarchicalInheritance {

	class SuperClass {
		
		void print() {
			System.out.println("Inside supercalsss print");
		}
	}
	
	class ChildOne extends SuperClass{
		void printChildOne() {
			System.out.println("Inside Childone printChildOne..");
		}
		
		@Override
		void print() {
			System.out.println("Inside child one print");
		}
	}
	
	class ChildTwo extends SuperClass{
		void printChildTwo() {
			System.out.println("Inside childtwo print..");
		}
	}
	
	public static void main(String[] args) {
		
		HierarchicalInheritance inheritance = new HierarchicalInheritance();
		
		ChildOne one = inheritance.new ChildOne();
		one.printChildOne();
		one.print();
	
	}

}
