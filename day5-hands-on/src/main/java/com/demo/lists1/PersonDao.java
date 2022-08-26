package com.demo.lists1;

import java.util.List;

public interface PersonDao {
	public String savePerson(Person p);
	public Person findBy(int id);
	public List<Person> listAllPersons();
}
