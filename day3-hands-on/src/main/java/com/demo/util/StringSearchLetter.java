package com.demo.util;
import java.util.Scanner;

public class StringSearchLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char l = 't';
		
		char[] chars = input.toLowerCase().trim().toCharArray();
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(chars[i]==l) {
				count++;
			}
		}
		System.out.println(count);
	}

}
