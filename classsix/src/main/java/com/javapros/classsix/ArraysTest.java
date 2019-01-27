package com.javapros.classsix;

class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
	}
	
}
public class ArraysTest {

	public static void main(String[] args) {
		
		//Declarimg an array.
		int[] age = new int[20];
		
		//Arrays maintains the order.
		age[0] = 29;
		age[1] = 30;
		age[15] = 40;
		
		System.out.println("length::" +age.length);
		System.out.println("element 15::"+ age[14]);
		
		for(int i=0; i <age.length ; i++) {
			System.out.println("age, elements::["+i+"]"+ +age[i]);
		}
		
		Student[] students = new Student[5];
		students[0] = new Student("chaithanya", 29);
		students[1] = new Student("murali", 30);
		students[3] = new Student("chaithanya", 29);
		
		System.out.println("length of students::" +students.length);
		System.out.println("students, element 5::"+ students[4]);
		for(int i=0; i <students.length ; i++) {
			System.out.println("students, elements::["+i+"]"+ students[i]);
		}
		
		//Please finish printing this.
		String[] names= new String[3];
		System.out.println("length of names::" +names.length);
		System.out.println("names, element 3::"+ names[2]);
		
		//Multidimentional arrays:
		int[][] twoDim = new int[][] {{1,2,3}, {3,4,5}};
		
		//accessing:
		for(int i =0; i < 2; i ++) {
			for(int j=0; j<3; j++) {
				System.out.println("elements inside two dimentional array:["+i+","+j+"]:::"+twoDim[i][j]);
			}
		}
		
		//Print three dimentional array:
		//Clone:
		
		//Deep clone.
		int[] ageClone = age.clone();
		if(age == ageClone) {
			System.out.println("references same..!");
		}else {
			System.out.println("references are not same..!");
		}
		//Shallow clone.
		int[][] twoDimCLone = twoDim.clone();
		if(twoDim == twoDimCLone) {
			System.out.println("references same two dim..!");
		}else {
			System.out.println("references are not same in twoDim..!");
			if(twoDim[0][0] == twoDimCLone[0][0]) {
				System.out.println("shallow clone");
			}
			
		}
		
	}

}
