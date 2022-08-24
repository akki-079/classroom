package com.demo.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> nameSet = new HashSet<>();
		SortedSet<String> nameSet = new TreeSet<>();
		//List<String> namesList = new ArrayList<>();
		//List<String> namesList = new Vector<>();
		nameSet.add("Akshad");
		nameSet.add("Peter");
		nameSet.add("Akshay");
		nameSet.add("Kartik");	
		nameSet.add("Naman");
		//namesList.add(0,"Satrang");
		nameSet.remove("Naman");
		System.out.println(nameSet.contains("Akshad"));
		System.out.println(nameSet);
		//System.out.println(namesList.get(4));
		System.out.println(nameSet.size());
		System.out.println(nameSet);
		
		Iterator<String> itr = nameSet.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		for(String name:nameSet) {
			System.out.println(name);
		}
		
		
	}
}