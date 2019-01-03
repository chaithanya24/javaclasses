package com.javapros.classtwo;

class Employee {
		
	//Fields/Attributes/State/Data of Object.
	//Instance varibales.
	int id;
	int age;
	String name;
	String ssn;
	int vacationDays;
	static String ceo;
	
	static {
		System.out.println("inside static");
		ceo = "Sundar";
	}

	public Employee() {
		System.out.println("inside default constructor");
	}
	
	public Employee(int id, int age, String name, String ssn, int vacationDays) {
		System.out.println("inside constructor");
		this.id = id;
		this.age = age;
		this.name = name;
		this.ssn = ssn;
		this.vacationDays = vacationDays;
	}

	//Method/Behavior.
	void printEmployeeDetails(int addSomevacationDays) {
		//You need to initialize a local variable/
		int addSomeMoreDays = 20;
		vacationDays = vacationDays + addSomevacationDays;
		System.out.println("Id:: "+id+ " age:: "+age + " name:: "
						+ name + " ssn:: "+ssn+ " vacation days::" +vacationDays);
	}
	
	
	
}

/**
 * 
 * @author p2799013
 *
 */
public class SampleObject {

	public static void main(String[] args) {

		//emp is on object.
		// Class is blueprint.
		// Object is an instance of class.
		// Constructor are used to get instance of an object (helps to constructor help to construct object).
		Employee eChaithanya = new Employee(1, 29, "chaithanya", "234-fff-666", 10);
		System.out.println(Employee.ceo);
		
		
		eChaithanya.printEmployeeDetails(2);
		
		Employee eChaithanya2 = new Employee(4, 29, "chaithanya", "234-1234-666", 9);
		eChaithanya2.printEmployeeDetails(3);
		
		Employee eMurali = new Employee(2, 30, "murali", "456-ggg-123", 12);
		eMurali.printEmployeeDetails(4);
		
		Employee eRam = new Employee(3, 30, "Ram", null, 20);
		eRam.printEmployeeDetails(5);
		
		Employee eEmpty = new Employee();
		eEmpty.printEmployeeDetails(6);
		
		//emp.id = 1;
		//emp.age = 29;
		//emp.name = "Chaithanya";
		//emp.ssn = "XXX-123-345";
		
		//Employee emp1 = emp;
		//emp.printEmployeeDetails();
		//emp1.printEmployeeDetails();
		
		//emp1.id = 2;
		//emp1.age = 31;
		//emp1.name = "Murali";
		//emp1.ssn = "XXX-234-765";
		
		//emp.printEmployeeDetails();
		//emp1.printEmployeeDetails();
		//System.out.println("age:: " + emp.age + " name:: " +emp.name + " ssan:: " +emp.ssn);
		//System.out.println("age:: " + emp1.age + " name:: " +emp1.name + " ssan:: " +emp1.ssn);
	}

}
