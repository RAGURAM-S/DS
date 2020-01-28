package com.ds;

import java.util.Scanner;

public class Execution {
	
	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter 1 to insert at the beginning of the linked list" + 
							   "\n" + 
							   "Enter 2 to delete at the beginning of the linked list");
			int n = object.nextInt();
			switch(n) {
				case 1: 
					int i; 
					double j;
					i = object.nextInt();
					j = object.nextDouble();
					list.insertAtBeginning(i, j);
					break;
				case 2:
					list.deleteAtBeginning();
					break;
				default:
					object.close();
					System.exit(0);
			}
		}
	}
}
