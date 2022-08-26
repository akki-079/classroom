package com.demo.ex1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {
		Predicate<String> predicate = a-> a.length()>5;
		Consumer<String> consumer = k-> System.out.println(k);
		Supplier<Integer> supplier =()-> 10;
		Function<Integer, String> function = (a)->"number is "+a;
		
		System.out.println(predicate.test("Akshad"));
		consumer.accept("Akshad");
		System.out.println(supplier.get());
		System.out.println(function.apply(5));

}
}