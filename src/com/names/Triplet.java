package com.names;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		int count = 0;
		for(int x = 0; x< size; x++) {
			array[x] = in.nextInt();
		}
		Arrays.sort(array);
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = i + 1; j < size; j++) {
					for(int k = j + 1; k < size; k++) {
						if(array[i] + array[j] == array[k]) {
							System.out.println(array[i] + " " + array[j] + " " + array[k]);
							count++;
					}
				}
			}
		}
		if(count > 0) {
			System.out.println(count);
		}
		else {
			System.out.println("-1");
		}
	}
}
