package com.ds;

public class Node{
	public int i;
	public double j;
	public Node next;
	
	Node(int i,double j){
		this.i = i;
		this.j =j;
	}
	
	public void displayLink(int i, int j) {
		System.out.println("{"+ i + "}");
	}
}