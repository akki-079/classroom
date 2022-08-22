package com.demo.exception;

public class Main {

	public static void main(String[] args) {
		try {
			int a = 30;
			int b = 0;
			double d = a/b;
			System.out.println("no exception");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ran without exceptions");

	}
}