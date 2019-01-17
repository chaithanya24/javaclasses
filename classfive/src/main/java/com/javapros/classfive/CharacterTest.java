package com.javapros.classfive;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char cVal = 'c';
		
		System.out.println("cVal::" +cVal);
		
		//Character wrapperVal = new Character('v');
		
		char upperCase = Character.toUpperCase('v');
		
		boolean result = Character.isUpperCase('c');
		
		System.out.println("upperCase::" +upperCase);
		
		System.out.println(" is upperCase::" +result);
		
		System.out.println("we are doing something \n interesting");
		//Assignement:
		//Use different character methods like isLetter/isDigit
		//toUpper/toLowerCase/ toString
		
	}
	
	

}
