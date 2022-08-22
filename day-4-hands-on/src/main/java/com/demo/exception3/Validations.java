package com.demo.exception3;

public class Validations {
	public void validateaAge(int age) {
		try {
			String response = null;
			if(age<18) {
				throw new RuntimeException("children not allowed");
			}
			else if(age>60) {
				throw new RuntimeException("senior citizens not allowed not allowed");
			}else if(age>18 && age<60) {
				System.out.println("Allowed age");
			}
			}catch(RuntimeException e){
				System.out.println(e.getMessage());
			}
		}
	}
