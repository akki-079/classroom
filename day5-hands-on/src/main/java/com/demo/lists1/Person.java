package com.demo.lists1;

import java.util.Objects;

public class Person {
	private int id;
	private String name;
	private String location;
	
	public Person(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public String getDetails() {
		return id+" "+name+" "+location;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
}
