package com.ds;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		boolean flag = true;
		if(num == 0 || num == 1) {
			flag = false;
		}
		else {
			for(int i = 2; i <= Math.sqrt(num) ; i++) {
				if(num%i == 0) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag == true) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}
