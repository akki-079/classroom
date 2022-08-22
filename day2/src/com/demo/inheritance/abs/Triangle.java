package com.demo.inheritance.abs;

public class Triangle extends Figure {
	private int base;
	private int height;
	public Triangle(int base, int height) {
		super(base,height);
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return 0.5*base*height;
	}
}
