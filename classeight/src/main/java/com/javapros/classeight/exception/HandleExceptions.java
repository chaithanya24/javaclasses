package com.javapros.classeight.exception;

import java.io.FileReader;

public class HandleExceptions {

	public static void main(String[] args) {
		
		//handleEx(10,0);
		//System.out.println("result::" +devidePositiveNumber(10,0));	
		try {
			handleUsingMyException(10, 0);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public static int dividePositiveNumber(int a, int b) {
		return a/b;	
	}
	
	static void handleEx(int a, int b) {
		try {
			
			int result = divideByHandlingEx(a, b);
			System.out.println("result::" + result);
		
		} catch (ArithmeticException arEx) {
			System.out.println("Arthmatic Exception::" +arEx);
			System.out.println("defalut result:" + 1);
		
		} catch(IllegalArgumentException ilEx) {
			System.out.println("Illegal Arguement Exception::" +ilEx);
			System.out.println("defalut result:" + 1);
		
		} catch (Exception e) {
			System.out.println("Exception::" +e);
			System.out.println("defalut result:" + 1);
		} finally {
			//Always gets executed.
			System.out.println("i am done deviding two values, exiting...");
		}
	}
	
	static void handleUsingMyException(int a, int b) throws MyException {
		try {
			
			int result = divideByHandlingEx(a, b);
			System.out.println("result::" + result);
		
		} catch (ArithmeticException arEx) {
			throw new MyException("My ArithmeticException, divide by zero");
		
		} catch(IllegalArgumentException ilEx) {
			throw new MyException("My IllegalArgumentException, args a=" + a+ "b=" + b); 
		
		} catch (Exception e) {
			throw new MyException("My Exception, args a=" + a+ "b=" + b); 
		} finally {
			//Always gets executed.
			System.out.println("i am done deviding two values, exiting...");
		}
	}
	
	static void handleExeptionByThrowing(int a, int b) throws Exception {
			
		int result = divideByHandlingEx(a, b);
		System.out.println("result::" + result);
	}
	
	static int divideByHandlingEx(int a, int b) throws Exception{
		if(a < 0 || b < 0 ) {
			
			throw new IllegalArgumentException("given negive number(s) a: "+ a+ "b: " +b);
		} else if(b == 0) {
			
			throw new ArithmeticException("devide by zero");
		} else if (a > 0 && b > 0 || a == 0){
			
			return a/b;
		} else {
			throw new Exception("Exception...");
		}
		
	}

}
