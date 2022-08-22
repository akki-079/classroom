package com.demo.calculator;
/**
 * 
 * @author aksbhand2
 * This is demo application to demonstrate private constructor and static methods.
 *
 */

public class App {
	/**
	 * 
	 * @param args
	 * Main method
	 */

	public static void main(String[] args) {
		//Calculator c1 = new Calculator();
		
		System.out.println(Calculator.add(4, 6));
		System.out.println(Calculator.multiply(4, 6));
		
	}

}
