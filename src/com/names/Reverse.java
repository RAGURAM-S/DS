package com.names;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse{
	
	public int binarySearch(int array, int l, int h, int key) {
		while(l <= h) {
			int mid = (l + h)/2;
			if(key > mid) {
				l = mid + 1;
			}
			else if(key < mid) {
				h = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BinarySearch bin = new BinarySearch();
		int num = in.nextInt();
		int array[] = new int[num];
		for(int i = 0; i < num; i++) {
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		for(int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
		int key = in.nextInt();
		int result = bin.binarySearch(array, 0, num - 1, key);
		if(result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index " + result);
		}
		in.close();
	}
}