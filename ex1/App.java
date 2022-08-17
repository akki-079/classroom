package com.demo.ex1;

public class App {

	public static void main(String[] args) {
		Box b = new Box(10, 20, 30);
		System.out.println(b.getColor());

		Box b1 = new Box(10, 20, 30, "blue");
		System.out.println(b.getColor());

		Box b3 = b1;

		//Box b3 = new Box(10, 20, 30, "Red", 65.6);

		System.out.println();
	}

}
