package com.ds;

import java.util.Scanner;

public class StringReversal {
		
	public static void reverseString(char array[], int size) {
		if(size < 0) {
			System.exit(0);
		}
		else {
			System.out.print(array[size]);
			reverseString(array, size - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char array[] = s.toCharArray();
		reverseString(array, s.length() - 1);
		in.close();
	}
}
