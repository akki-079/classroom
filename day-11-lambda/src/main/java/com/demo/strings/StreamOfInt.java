package com.demo.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StreamOfInt {

	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(3,6,5,7,8,9,4,45,67,34,53,24,58);
		//Predicate<Integer> predicate = (x)-> x%2==0;
		numsList.stream().filter(x->x%2==0).forEach(System.out::println);
		System.out.println("--------------------------");
		StreamOfInt k = new StreamOfInt();
		
System.out.println(		numsList.stream().filter(x->x%2==1).count());		System.out.println("--------------------------");

		numsList.stream().filter(x->x>24).forEach(k::print);		
		System.out.println("--------------------------");
		List<Integer> greator24 = numsList.stream().filter(x->x>24).toList();
		int sum = numsList.stream().filter(x->x%2==0).mapToInt(x->x.intValue()).sum();
		System.out.println(sum);
		System.out.println(greator24);
	}
	
	public void print(int a) {
		System.out.println(a);
	}

}
