package com.javapros.classthree;

public class StudentTest {

	
	public static void main(String[] args) {
		
		Student chaithanya = new Student(1, "chaithanya", "male", 29);
		System.out.println("name: " +chaithanya.name);
		
		GiftedStudent chaithanyaK = new  GiftedStudent("none");
		chaithanyaK.name = "chaithanya";
		chaithanyaK.printDetails();

		//chaithanya.printSudentDetails();
		//Teacher chaithanyaTeacher = new Teacher(2, "chaithanya", "male", 40);
		
	}

}
