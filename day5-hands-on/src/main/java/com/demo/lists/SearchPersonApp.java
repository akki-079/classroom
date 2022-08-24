package com.demo.lists;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchPersonApp {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person(1,"Akshad","Delhi"));
		personList.add(new Person(2,"Akshay","Hyderabad"));
		personList.add(new Person(3,"Sharad","Bulandshahar"));
		personList.add(new Person(4,"Isha","Goa"));
		personList.add(new Person(5,"Heena","Daman"));
		personList.add(new Person(6,"Lakshay","Denmark"));
		personList.add(new Person(7,"Purnima","Diu"));
		personList.add(new Person(8,"Akriti","Dholpur"));
		personList.add(new Person(9,"Aman","Ranchi"));
		personList.add(new Person(10,"Praveen","Jhansi"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person Id to search person details");
		int id = scanner.nextInt();
		int check = 0;
		for(Person person:personList) {
			
			if(id == person.getId()) {
				System.out.println(person.getDetails());
				System.out.println(person.getClass().getName());
				check=1;
				break;
			}
		}
		if(check==0) {
			System.out.println("Entry not found.");
		}

	}

}
