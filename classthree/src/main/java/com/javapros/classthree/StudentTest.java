package com.javapros.classthree;

import com.javapros.singlton.SingletonSample;

public class StudentTest {

	
	public static void main(String[] args) {
		
		Student chaithanya = new Student(1, "chaithanya", "male", 29);
		chaithanya.setAge(30);
		System.out.println("name: " +chaithanya.getAge());
		
		GiftedStudent chaithanyaK = new  GiftedStudent("none");
		chaithanyaK.setName("ChaithanyaK");
		chaithanyaK.printDetails();

		//chaithanya.printSudentDetails();
		//Teacher chaithanyaTeacher = new Teacher(2, "chaithanya", "male", 40);
		
		SingletonSample singletonSample = SingletonSample.getSinglton();
	}
	

}
