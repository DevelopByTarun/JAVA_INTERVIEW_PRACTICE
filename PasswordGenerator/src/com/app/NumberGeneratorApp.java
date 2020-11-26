package com.app;

import java.util.ArrayList;
import java.util.List;

public class NumberGeneratorApp {
	
	private static List<Integer> passwordList = new ArrayList<Integer>();
	
	private static void getPassword(int start, int end) {
		int range = (end - start) + 1;
		for(int i = 0; i < 10; i++) {
			int value = (int) (Math.random() * range) + start;
			passwordList.add(value);
		}
		passwordList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGeneratorApp.getPassword(100, 200);
		
	}
	
	

}
