package com.demo.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> namesList = new LinkedList<>();
		//List<String> namesList = new ArrayList<>();
		//List<String> namesList = new Vector<>();
		namesList.add("Akshad");
		namesList.add("Peter");
		namesList.add("Akshay");
		namesList.add("Kartik");	
		namesList.add("Naman");
		namesList.add(0,"Satrang");
		namesList.remove(2);
		System.out.println(namesList.contains("Akshad"));
		System.out.println(namesList);
		System.out.println(namesList.get(4));
		System.out.println(namesList.size());
		System.out.println(namesList);
		Iterator<String> itr = namesList.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		for(String name:namesList) {
			System.out.println(name);
		}
		
		
	}
}