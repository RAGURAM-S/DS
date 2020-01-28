package com.names;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperDigit {
	
	static long findDigitSum(long number, long sum) {
		if (!(number > 0)) {
			return sum;
		}
		return findDigitSum(number/10, sum+(number%10));
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		String[] strs = num.trim().split("\\s+");
		String n = strs[0];
		String c = strs[1];
		long number = Long.parseLong(n);
		long count = Long.parseLong(c);
		long sum = 0;
		long result = findDigitSum(number, sum);
		result = result*count;
		while(result >= 10) {
			result = findDigitSum(result, 0);
		}
		System.out.println(result);
	}
}