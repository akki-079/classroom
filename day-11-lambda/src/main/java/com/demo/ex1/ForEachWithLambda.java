package com.demo.ex1;

import java.util.Arrays;
import java.util.List;

public class ForEachWithLambda {

	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("apple","orange","mango","banana","watermelon");
		//fruit.forEach((String s)->System.out.println(s));
		//fruit.forEach(System.out::println); // only statyc methid
		
		ForEachWithLambda i = new ForEachWithLambda();
		fruit.forEach(i::print);// for non static method

	}
	
	public void print(String s) {
		System.out.println(s);
	}

}
