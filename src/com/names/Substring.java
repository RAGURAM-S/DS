package com.names;

import java.util.Scanner;

public class Substring{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		int total = in.nextInt();
		for(int k = 0; k < size; k++) {
			array[k] = in.nextInt();
		}
		boolean flag = false;
		
		for(int i = 0; i < size - 1 ; i++) {
			int sum = array[i];
			for(int j = i + 1; j < size; j++) {
				sum = sum + array[j];
				if(sum == total) {
					System.out.println("start :" + i + 1);
					System.out.println("end   :" + j + 1);
					flag = true;
					break;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("-1");
		}
	}
}