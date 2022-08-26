package com.demo.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {

	public static void main(String[] args) {
		List<String> apples = new ArrayList<>();
		apples.add("fuji");
		
		List<String> oranges = new ArrayList<>();
		oranges.add("nagpur");
		oranges.add("shimla");
		Collections.copy(oranges, apples);
		
		
		System.out.println(oranges);
		
	}

}
