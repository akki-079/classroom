package com.demo.hello;

public class Person {
private int personid;
private String name;
private String email;
private long number; 

public Person(int personid, String name) {
	this.personid = personid;
	this.name = name;
}

public Person(int personid, String name, String email) {
	this.personid = personid;
	this.name = name;
	this.email = email;
}

public int getPersonid() {
	return this.personid;
}

public String getName() {
	return this.name;
}
public String getEmail() {
	return this.email;
}
public long getNumber() {
	return this.number;
}

public void setPersonid(int personid) {
	this.personid = personid;
}

public void setName(String name) {
	this.name = name;
}

public void setEmail(String email) {
	this.email = email;
}

public void setNumber(long number) {
	this.number = number;
}



}


