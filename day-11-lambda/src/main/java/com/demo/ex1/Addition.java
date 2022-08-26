package com.demo.ex1;

public class Addition {

	public static void main(String[] args) {
		AddNumber<AddFloat> addFloat = new AddNumber<>();
		addFloat.sum1 = new AddFloat(4,6);
		
		AddNumber<AddInt> addInt = new AddNumber<>();
		addInt.sum1 = new AddInt(3,5);
		
		System.out.println(addInt.sum1.sumInt());
		System.out.println(addFloat.sum1.sumFloat());
		
		
	}

}
