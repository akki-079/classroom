package com.demo.exception3;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		Validations validateAge = new Validations();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int age = sc.nextInt();
			validateAge.validateaAge(age);
		}
		
	}
	
	

}
