package com.javapros.classseven.inheritance;

public class MultiLevelInheritance {

	class MultiLevelA {
		void printA() {
			System.out.println("inside printA...");
		}
		
	}
	
	class MultiLevelB extends MultiLevelA {
		
		void printB() {
			System.out.println("Inside printB..");
		}
		
		@Override
		void printA() {
			System.out.println("Inside LevelB printA..");;
		}
	}
	
	class MultiLevelC extends MultiLevelB {
		
		void printC() {
			System.out.println("Inside printC..");
		}
		
		@Override
		void printA() {
			// TODO Auto-generated method stub
			System.out.println("Inside LevelC printA..");;;
		}
	}
	
	public static void main(String[] args) {
		
		MultiLevelInheritance multiLevelInheritance = new MultiLevelInheritance();
		MultiLevelC c = multiLevelInheritance.new MultiLevelC();
		c.printA();
		c.printB();
		c.printC();
		
		MultiLevelB b = multiLevelInheritance.new MultiLevelB();
		b.printA();
		b.printB();
		
		MultiLevelB b1 = multiLevelInheritance.new MultiLevelC();
		b1.printA();
		b1.printB();
		
		MultiLevelA a = multiLevelInheritance.new MultiLevelB();
		a.printA();
		
		

	}

}
