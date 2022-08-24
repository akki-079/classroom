package com.demo.lists1;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao{
	private List<Person> personList = new ArrayList<>();

	@Override
	public String savePerson(Person p) {
		personList.add(p);
		return "New person added to the list";
	}


	@Override
	public List<Person> listAllPersons() {
		
		return personList;
	}


	@Override
	public String findBy(int id) {
		int check = 0;
		for(Person person:personList) {
			if(person.getId() == id) {
				check = 1;
				return person.getDetails();
				
			}
		}
		if(check ==0) {
			return "Entry not found";
		}
		return null;
	}

}
