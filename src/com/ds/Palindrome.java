//package com.ds;
//
//import java.util.Scanner;
//
//public class Palindrome{
//	
//	static int checkPalindrome(int number) {
//		int rem= 0;
//		int sum = 0;
//		while(number > 0) {
//			rem = number%10;
//			sum = (sum * 10) + rem;
//			number = number/10;
//		}
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		in.close();
//		int result = checkPalindrome(num);
//		if(result == num) {
//			System.out.println(num + " is a palindrome");
//		}
//		else {
//			System.out.println(num + " is not a palindrome");
//		}
//		
//	}
//}


package com.ds;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String original = in.next();
		in.close();
		String reverse = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.print("palindrome");
		}
		else {
			System.out.print( "not a palindrome");
		}
	}
}