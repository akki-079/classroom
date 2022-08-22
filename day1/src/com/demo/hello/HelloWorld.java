package com.demo.hello;


public class HelloWorld {

	public static void main(String[] args) {
		Person john = new Person(1,"John");
		System.out.println("\nPerson Id : "+john.getPersonid()+"\nName : "+john.getName()+"\nEmail : "+john.getEmail()+"\nPhone Number : "+john.getNumber());
		Person peter = new Person(2,"Peter","peter@nowhere.com");
		System.out.println("\nPerson Id : "+peter.getPersonid()+"\nName : "+peter.getName()+"\nEmail : "+peter.getEmail()+"\nPhone Number : "+peter.getNumber());
		
		john.setEmail("john@sidekick.com");
		System.out.println("\nPerson Id : "+john.getPersonid()+"\nName : "+john.getName()+"\nEmail : "+john.getEmail()+"\nPhone Number : "+john.getNumber());
		
		peter.setNumber(987654399);
		System.out.println("\nPerson Id : "+peter.getPersonid()+"\nName : "+peter.getName()+"\nEmail : "+peter.getEmail()+"\nPhone Number : "+peter.getNumber());

	}

}
