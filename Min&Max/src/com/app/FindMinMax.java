package com.app;

import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		boolean flag = true;
		
		while(true) {		// endless loop
			
			System.out.println("enter number => ");
			boolean intValue = input.hasNextInt();
			
			if(intValue) {
				
				int number = input.nextInt();
				
				if(flag) {
					
					flag = false;
					min = number;
					max = number;
				}
				
				if(number < min) {
					
					min = number;
				}
				
				if(number > max) {
					
					max = number;
				}
				
			} else {
				
				break;
			}
		}
		
		System.out.println("min => "+min + " max => "+ max);
		input.close();
		
	}
}
