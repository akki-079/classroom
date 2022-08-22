package com.demo.calc;

public class Calculator {

	public static void main(String[] args) {
		NumberGenerator numberGenerator = new NumberGenerator();
		int a = numberGenerator.getFirstNumber();
		int b = numberGenerator.getSecondNumber();
		System.out.println("sum of two random numbers "+a+" and "+b+" is "+(a+b) );
	}

}
