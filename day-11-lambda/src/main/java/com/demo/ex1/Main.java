package com.demo.ex1;

public class Main {

	public static void main(String[] args) {
		Greeter goodMorning = new Greeter() {
			
			@Override
			public String getGreet(String name) {
				
				return "Good Morning";
			}
		};
		// lambda expression
		System.out.println(goodMorning.getGreet("Akshad"));
		Greeter goodEvening = (name)->"Good Evening "+name; // possible only if interface has 1 method
		System.out.println(goodEvening.getGreet("Akshad"));
		Runnable r=()->System.out.println("hello");
		
		Concat concThis = (a,b)->a+" "+b;
		System.out.println(concThis.conc("Akshad", "Bhandula"));;
	}

}
