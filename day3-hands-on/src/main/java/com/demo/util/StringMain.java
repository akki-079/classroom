package com.demo.util;

public class StringMain {

	public static void main(String[] args) {
String s1 = "Hello";
String s2 = "hi";
String s3 = "Hello";
String s4 = new String("Hello");
String s5 = "Hello";
String s6 = new String("Hello");

System.out.println("s1==s3 : "+ (s1==s3));
System.out.println("s2==s4 : "+ (s2==s4));
System.out.println("s1==s5 : "+ (s1==s5));
System.out.println("s4==s6 : "+ (s4==s6));



	}

}
