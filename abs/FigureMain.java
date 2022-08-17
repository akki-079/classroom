package com.demo.inheritance.abs;

public class FigureMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(20, 30);

		System.out.println(r.area());
		System.out.println(t.area());
	}
}