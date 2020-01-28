//package com.ds;
//
//import java.util.Scanner;
//
//public class Duplicates{
//	
//	public static void printDuplicates(int array[], int size) {
//		int temp_array[] = new int[array.length];
//		System.out.println("the repeating elements are");
//		for(int i = 0; i < size; i++) {
//			if(temp_array[array[i]] == 1) {
//				System.out.println(array[i]);
//			}
//			else {
//				temp_array[array[i]]++;
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int size = in.nextInt();
//		int array[] = new int[size];
//		for(int i = 0; i < size; i++) {
//			array[i] = in.nextInt();
//		}
//		printDuplicates(array, size);
//		
//	}
//}


package com.ds;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicates{
	
	public static void findDuplicates(int array[], int size) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < size; i++) {
			if(map.get(array[i]) == null) {
				map.put(array[i], 1);
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		findDuplicates(array, size);
	}
}