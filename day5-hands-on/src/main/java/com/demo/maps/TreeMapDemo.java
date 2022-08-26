package com.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer, String> mobileData = new TreeMap<>();
		
		mobileData.put(971190963,"Akshay");
		mobileData.put(661190963,"Karan");
		mobileData.put(781190963,"Sunny");
		mobileData.put(976990963,"Sagar");
		mobileData.put(971156963,"Isha");
		mobileData.put(971354963,"Palak");
		mobileData.put(971537863,"Sukhman");
		System.out.println(mobileData);
		System.out.println(mobileData.get(971190963));
		
		Set<Integer> keySet = mobileData.keySet();
		
		for(Integer key:keySet) {
			System.out.println(key+"------>"+mobileData.get(key));
		}
	}

}
