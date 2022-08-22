package com.demo.inheritance.abs;

public class Rectangle extends Figure {
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		super(length,breadth);
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return length*breadth;
	}
}
