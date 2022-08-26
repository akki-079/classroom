package com.demo.lists;

import java.awt.Checkbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SearchPersonAppOnSet {

	public static void main(String[] args) {
		SortedSet<Person> personSet = new TreeSet<>();
		
		personSet.add(new Person(1,"Akshad","Delhi"));
		personSet.add(new Person(2,"Akshay","Hyderabad"));
		personSet.add(new Person(5,"Sharad","Bulandshahar"));
		personSet.add(new Person(7,"Isha","Goa"));
		personSet.add(new Person(3,"Heena","Daman"));
		personSet.add(new Person(4,"Lakshay","Denmark"));
		personSet.add(new Person(11,"Purnima","Diu"));
		personSet.add(new Person(8,"Akriti","Dholpur"));
		personSet.add(new Person(10,"Aman","Ranchi"));
		personSet.add(new Person(9,"Praveen","Jhansi"));
		System.out.println(personSet);
		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter person Id to search person details");
//		int id = scanner.nextInt();
//		int check = 0;
//		for(Person person:personSet) {
//			
//			if(id == person.getId()) {
//				System.out.println(person.getDetails());
//				System.out.println(person.getClass().getName());
//				check=1;
//				break;
//			}
//		}
//		if(check==0) {
//			System.out.println("Entry not found.");
//		}

	}

}
