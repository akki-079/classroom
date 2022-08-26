package com.demo.strings;

import java.util.Arrays;
import java.util.List;

public class StreamsOfString {

	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("apple","orange","mango","banana","watermelon","papaya","strawberry");
		fruit.stream().filter(x->x.length()>5).forEach(System.out::println);
		System.out.println("--------------------------");
		fruit.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		System.out.println("--------------------------");
		fruit.stream().map(x->x.length()).forEach(System.out::println);
		System.out.println("--------------------------");
		List<Integer> nameLength = fruit.stream().map(x->x.length()).toList();
		System.out.println(nameLength);
		System.out.println("--------------------------");
		fruit.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------------");
		



		
		
	}

}
