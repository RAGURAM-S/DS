package com.ds;

import java.util.Scanner;

public class Series{
	
	public static int digitSum(int number) {
		if(number > 9) {
			return number%10 + digitSum(number/10);
		}
		else {
			return number;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int result = digitSum(num);
		System.out.println(result);
	}
}