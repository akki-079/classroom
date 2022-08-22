package com.demo.inheritance.ex1;

public class Student extends Person {
	private String standard;
	private String subject;
	
	
	public Student(int id, String name, String location,String standard, String subject) {
		super(id,name,location);
		this.standard = standard;
		this.subject = subject;
		}
	
	public String getDetails() {
		return standard+" "+subject;
	}
	
}
