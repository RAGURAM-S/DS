package com.names;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
	public static void main(String[] args) {

		boolean flag = true;
		Scanner object = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		 for(int k = 0; k < 10; k++){
			String name = object.next();
			if (name == "exit") {
				flag = false;
				
			}

			else {

				if (!array.contains(name)) {
					array.add(name);
					System.out.println(name + " " + "name added");
				} 
				
				else {
					int count = 0;
					for (int i = 0; i < array.size(); i++) {
						if (array.get(i) == name) {
							count++;
						}
						String newName = Integer.toString(count);
						String name1 = name.concat(newName);
						array.add(name1);
						System.out.println(name1);
					}
				}

			}
		} 

		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j));
		}
	}
}
