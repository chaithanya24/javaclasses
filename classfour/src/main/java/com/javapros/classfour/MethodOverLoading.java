package com.javapros.classfour;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		
		int sum = add(2, 5);
		System.out.println("sum of two digits from main::" +sum);
		
		int sumOfThree = add(4,5,6);
		System.out.println("Sum of three digits are::" +sumOfThree);

		float sumOfFour = add(4,5,6,7);
		System.out.println("Sum of four digits are::" +sumOfFour);
	}
	
	
	private static int add(int a, int b) {
		int c = a+b;
		System.out.println("sum of two digits::" +c);
		return c;
	}
	
	private static int add(int a, int b, int d) {
		int c = a+b+d;
		return c;
	}
	
	static float add(int a, int b, int c, int d) {
		float e = a+b+c+d;
		return e;
	}
	
	//Assigmenet:
	//TO DO method over loading for finding area of differnt shapes (triangle, rectangle, circle etc))
	//TO DO take two number (if less then print less then / if given greaterthan print greatrthan)\
	// TO DO use stwitch to print week day based on number/ also months.
	
	

}
