package javaCollections;

import java.util.Scanner;

public class P3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your strings separated by"
				+ " a single space: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split(" ");	
		int arraySize = input.length;
		
		System.out.println();
		System.out.println("Your largest sequence of equal strings"
				+ " is thisone: ");
		System.out.println();
		
		int bestEqualStringsLength = 1;
		int equalStringsLength = 1;
		int startPosition = 0;
		int bestStartPosition = 0;
		
		for (int i = 0; i < arraySize - 1; i++) {
			
			if (input[i].equals(input[i + 1])) {
				equalStringsLength++;
				
				if (bestEqualStringsLength < equalStringsLength) {
					bestEqualStringsLength = equalStringsLength;
					bestStartPosition = startPosition;
				}
			} else {
				equalStringsLength = 1;
				startPosition = i + 1;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < bestEqualStringsLength; i++) {
			System.out.print(input[bestStartPosition + count] + " ");
			count++;
		}
		
		System.out.println();
	}
}