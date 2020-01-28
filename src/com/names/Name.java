package com.names;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();		
		for(int i =0; i < 10; i++) {
			Scanner in = new Scanner(System.in);
			String input = in.next();
			int count = 0;
			if(map.containsKey(input)) {
				count = map.get(input);
				count++;
				map.put(input, count);
				input = input.concat(Integer.toString(count));
				map.put(input, count);
			}
			else {
				map.put(input, count);
			}
		}
		
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	}
}
