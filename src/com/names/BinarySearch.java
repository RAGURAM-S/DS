package com.names;

public class BinarySearch {
	
	static int binarySearch(int array[], int low, int high, int key) {
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(array[mid] < key) {
				low = mid + 1;
			}
			else if(array[mid] > key) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int array[] = {1, 2, 5, 10, 15, 25};
		int length = array.length;
		int key = 10;
		int result = binarySearch(array, 0, length - 1, key);
		if(result == -1) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element found at index " + result);
		}
	}
}
