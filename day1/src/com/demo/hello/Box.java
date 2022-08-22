package com.demo.hello;
import java.util.Scanner;

public class Box {
	private int length;
	private int breadth;
	private int height;
	

	public Box() {
		System.out.println("no params");
		try (Scanner inputObject = new Scanner(System.in)) {
			System.out.println("length");
			this.length = inputObject.nextInt();
			System.out.println("height");
			this.height = inputObject.nextInt();
			System.out.println("breadth");
			this.breadth = inputObject.nextInt();
		}
		
	}

	public Box(int length,int breadth) {
		System.out.println("ONLY LENGTH : "+length+" and BREADTH : "+breadth+" is provided");
		
		
	}
	
	public Box(int length,double height) {
		System.out.println("ONLY LENGTH : "+length+" and BREADTH : "+height+" is provided");
		
		
	}
	
	public Box(int length,int breadth,int height) {
		System.out.println("LENGTH : "+length+" and BREADTH : "+breadth+" and HEIGHT : "+height+" all are provided");
		
		
	}
	public double volume() {
		double vol = length*breadth*height;
		return vol;
		
	} 
}
