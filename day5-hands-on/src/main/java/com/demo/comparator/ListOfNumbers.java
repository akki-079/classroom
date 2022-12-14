package com.demo.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfNumbers {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(7);
		numsList.add(9);
		numsList.add(1);
		numsList.add(6);
		numsList.add(3);
		numsList.add(5);
		numsList.add(4);
		numsList.add(2);
		
		System.out.println(numsList);
		numsList.sort(new NumSorter());
		System.out.println(numsList);
		
	}

}

class NumSorter implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.intValue() - o2.intValue();
	}
}
