package com.demo.lists;

import java.awt.Checkbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchPersonAppOnSet {

	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();
		
		personSet.add(new Person(1,"Akshad","Delhi"));
		personSet.add(new Person(2,"Akshay","Hyderabad"));
		personSet.add(new Person(3,"Sharad","Bulandshahar"));
		personSet.add(new Person(4,"Isha","Goa"));
		personSet.add(new Person(5,"Heena","Daman"));
		personSet.add(new Person(6,"Lakshay","Denmark"));
		personSet.add(new Person(7,"Purnima","Diu"));
		personSet.add(new Person(8,"Akriti","Dholpur"));
		personSet.add(new Person(9,"Aman","Ranchi"));
		personSet.add(new Person(10,"Praveen","Jhansi"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person Id to search person details");
		int id = scanner.nextInt();
		int check = 0;
		for(Person person:personSet) {
			
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
