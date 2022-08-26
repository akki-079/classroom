package com.demo.lists1;

public class PersonDaoMain {

	public static void main(String[] args) {
		PersonDao personDao = new PersonDaoImpl();
		System.out.println(personDao.savePerson(new Person(1, "Akshad", "Delhi")));
		System.out.println(personDao.savePerson(new Person(2, "Akshita", "Daman")));
		System.out.println(personDao.savePerson(new Person(3, "Aks", "Diu")));	
		
		System.out.println(personDao.listAllPersons());
		
		Person myPerson = personDao.findBy(3);
		System.out.println(myPerson);
		
//		if(myPerson == null) {
//			System.out.println("Entry not found");
//		}
//		else {
//			System.out.println(myPerson.getDetails());
//		}
		
		}

}
