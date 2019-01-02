package com.javapros.classone;

/**
 * Explaining operators
 * @author p2799013
 *
 */
public class OperatorsExamples {

	public static void main(String[] args) {
		
		/**
		 * *,/,% > +,-
		 */
		
		double f = 2+3*5/2+2;
		System.out.println("x values:" +f);
		
		/**
		 * relational operator.
		 * <, <=, >, >=, ==, !=
		 */
		int x = 3;
		x = 7;
		if(x == 3) {
			x = 6;
			System.out.println("correct you passed the check");
		}
		
		/**
		 * Assignment operator.
		 * ++, +=, -- etc
		 */
	    //Post increment ++, pre increment use.
		//x = x+1;
		x = x++;
		
		/*for(int i =0 ; i< 10 ;i++) {
			System.out.println("i value::" +i);
		}*/
		System.out.println("x latest values:" +x);
		System.out.println("x values: "+x);
		
		x = x++;
		if(x == 8) {
			System.out.println("inside increament");
		}
		
		/**
		 * logical operator.
		 * TT -> T
		 * TF-> T
		 * FT->T
		 * FF->F
		 * TTT->T ...so on.
		 */
		
		if(x == 8 || f == 12.0) {
			System.out.println("condition satified");
		}
		
		/**
		 * 
		 * Ternary operator.
		 * 
		 */
		
		
		String str = (x == 8) ? "correct" : "wrong";
		/**
		 * in if block
		 */
		String str1 = "";
		if(x == 8) {
			str1 = "correct";
		} else {
			str1 = "wrong";
		}
		System.out.println(str1);

	}

}
