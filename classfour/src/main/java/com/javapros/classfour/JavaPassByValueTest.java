package com.javapros.classfour;

public class JavaPassByValueTest {

	int i = 10;
	int j = 20;
	
	public static void main(String[] args) {
	
		JavaPassByValueTest obj = new JavaPassByValueTest();
		System.out.println("i::" +obj.i + "j::"+obj.j);
		
		obj.swap(obj.i, obj.j);
		
		System.out.println("after swap::");
		System.out.println("i::" +obj.i + "j::"+obj.j);	

	}
	
	public void swap(int x, int y) {	
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("Swapped values");
		System.out.println("i::" +x + "j::"+y);	
	}

}
