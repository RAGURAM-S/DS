package com.ds;

import java.util.Scanner;

public class ArrayReversal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int array[] = new int[num];
		int mid = 0;
		for(int i = 0; i < num; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		if(num%2 != 0) {
			mid = (num/2) + 1;
			int j = num - 1;
			for(int i = 0; i < mid - 1; i++) {
				while(j >= mid) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					j--;
					break;
				}
				
			}
		}
		else {
			mid = num/2;
			int j = num - 1;
			for(int i = 0; i < mid; i++) {
				while(j >= mid) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					j--;
					break;
				}
			}
		}
		
		for(int k = 0; k < num; k++) {
			System.out.println(array[k]);
		}
	}
}
