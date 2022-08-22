package com.demo.inheritance.ex1;

public class MainApp {

	public static void main(String[] args) {
		Person raja = new Person(1,"Raja","Bageshwar");
		Employee karan = new Employee(2,"Karan","Chandigarh",55000);
		TraineeEmp vimal = new TraineeEmp(3,"Vimal","Ludhiana",20000,"Very Good");
		
		System.out.println(raja.getDetails());
		System.out.println(karan.getDetails());
		System.out.println(vimal.getDetails());
		
		Person p = karan;
		System.out.println(p.getDetails());
		p=vimal;
		System.out.println(p.getDetails());
		
		

	}

}
