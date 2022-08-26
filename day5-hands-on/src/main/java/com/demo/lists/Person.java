package com.demo.lists;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private Integer id;
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
	
	public Integer getId() {
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

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setId(int id) {
		this.id = id;
	}
}
