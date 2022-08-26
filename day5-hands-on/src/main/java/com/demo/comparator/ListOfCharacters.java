package com.demo.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOfCharacters {

	public static void main(String[] args) {
		List<Character> charsList = new ArrayList<>();
		
		charsList.add('a');
		charsList.add('h');
		charsList.add('y');
		charsList.add('U');
		charsList.add('t');
		charsList.add('p');
		charsList.add('w');
		charsList.add('r');
		charsList.add('c');
		
		System.out.println(charsList);
		charsList.sort(new CharSorter());
		System.out.println(charsList);
		
	}

}

class CharSorter implements Comparator<Character>{
	
	@Override
	public int compare(Character o1, Character o2) {
		return o1.charValue()- o2.charValue();
	}
}
