package com.javapros.singlton;

//Immutable class.
final class Square {
	//We made this filed as immutable.
	private int side ;
	
	final static String name = "MY-SQUARE";
	
	public Square(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if(side < 5) {
			this.side = 10;
		}
		this.side = side;
	}

	void area() {
		
		int area = side*side;
		System.out.println("area::" +area);
	}
	
	
	
	
}
/*POJO*/ 
// - You could control the validations.
// - You could also control the public API access to fields.
// - Object to hold the state (mostly using immutability) 

public class SampleFinalTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Square square = new Square(10);
	Square squere1 = new Square(20);

	//we can do this because it is final field.
	//square.side = 20;
	System.out.println("side::" + squere1.getSide() +"  name::" +Square.name);
	squere1.area();
		
	
	}

}
