package com.demo.generics.ex0;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Glass<Juice> glass = new Glass();
		glass.liquid = new Juice();
		
		Glass<Water> glass1 = new Glass();
		glass1.liquid = new Water();
		
		Water water = glass1.liquid;
		
		ArrayList list = new ArrayList();
		
		list.add("45");
		list.add("56");
		list.add("566");
		list.add("24");
		list.add("3454");
	}

}
