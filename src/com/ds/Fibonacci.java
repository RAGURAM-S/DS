package com.ds;

import java.util.Scanner;

public class Fibonacci {
	
	static int count = 0;
	
	public static void computeSeries(double limit, double term1, double term2) {
		if(count < limit) {
			System.out.println(term1 + term2);
			count++;
			computeSeries(limit, term2, term1 + term2);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		double term1 = 0;
		double term2 = 1;
		System.out.println(term1);
		System.out.println(term2);
		computeSeries(num, term1, term2);
	}
}
