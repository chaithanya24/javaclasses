package com.javapros.classfive;

public class AutoBoxingTest {

	String ceo = "SUndar";
	
	public static void main(String[] args) {
		
		int i = -10;
		
		int result = getAbsoluteVal(i);
		
		System.out.println("result::" +result);
		
		Integer val = new Integer(5);
		
		val = val + 7;
		
		int addedVal = val + 7;
		
		System.out.println("intVal::" +addedVal);
		
		//Assignments:
		
		// write boxing and unbosing code for short, long, remaining primitives.
		
		float fVal = 20;
		
		Float wrapperFVal = fVal;
		
		System.out.println("wrapperFval::" +wrapperFVal);
		
		Float wfVal = new Float(40);
		
		float r = Float.max(20, 30);
		
		System.out.println("Result::" +r);
		
		float convertedFval = wfVal;
		
		System.out.println("converted float val::" +convertedFval);
		

	}
	
	private static Integer getAbsoluteVal(int i) {
		if(i < 0) {
			return -i;
		} else {
			return i;
		}
	}

}
