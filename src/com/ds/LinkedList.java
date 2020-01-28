package com.ds;

public class LinkedList {
	
	public Node first;
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertAtBeginning(int i, double j) {
		Node newNode = new Node(i, j);
		newNode.next = first;
		first = newNode;
	}
	
	public void deleteAtBeginning() {
		if(isEmpty() == true) {
			System.out.println("The list is empty");
		}
		else {
		Node temp = first;
		first = first.next;
		System.out.println(temp + " is deleted from the linked list");
		}
	}
}
