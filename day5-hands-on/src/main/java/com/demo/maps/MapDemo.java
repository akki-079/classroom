package com.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mobileData = new HashMap<>();
		
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
