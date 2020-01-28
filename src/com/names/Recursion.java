package com.names;

import java.util.Scanner;

public class Recursion {

	public static int findFactorial(int number) {
		if (number <= 1) {
			return 1;
		} else {
			return number * findFactorial(number - 1);

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int result = findFactorial(num);
		System.out.println(result);
	}
}