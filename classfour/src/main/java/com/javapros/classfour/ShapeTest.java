package com.javapros.classfour;

class Rectangle {

	private int length;
	private int breadth;

	/*
	 * Constructor
	 */
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int area() {
		
		int area = length * breadth;
		System.out.println("area of rectangle:: " + area);
		return area;
	}
	
	public int multipleArea(int multiplier, int area) {
		
		int result = area*multiplier;
		System.out.println("Multiplied area::" +result);
		return result;
		
	}

}

public class ShapeTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 5);
		int area = rectangle.area();
		
		int multipliedArea = rectangle.multipleArea(2, area);
		
		Rectangle rectangle2 = new Rectangle(10, 6);
		int area1 = rectangle2.area();
		
		int multipliedArea1 = rectangle2.multipleArea(5, area1);
		
		//Q: I want to add areas of the above two rectangle?
		
		int totalArea = area + area1;
		
		System.out.println("total Area::" +totalArea);
		System.out.println("total multiplied areas::" +(multipliedArea+multipliedArea1));
	}
	

	// assignemnt:
	//- Square area.
	// - minimum and maximum of two number.
	
}
