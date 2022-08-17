package com.demo.inheritance;

public class PersonMain {

	public static void main(String[] args) {

		// Student st = new Student(1, "john", "Hydrabad", "Excellent");
		Person peter = new Person(2, "peter", "karnataka");
		Employee harry = new Employee(3, "harry", "kerala", 7364);
		TraineeEmp marry = new TraineeEmp(4, "marry", "tamilnadu", 7678, "good");

		System.out.println(peter.getDetails());
		// System.out.println(st.getDetails());

		Person p = harry;
		System.out.println(p.getDetails());

		p = marry;
		System.out.println(p.getDetails());
	}

}
