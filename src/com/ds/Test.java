package com.ds;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		byte array[] = str.getBytes();
		System.out.println(Arrays.toString(array));
		String str1 = new String(array);
		System.out.println(str1);
	}
}
