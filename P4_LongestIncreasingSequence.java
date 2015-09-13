package javaCollections;

import java.util.Scanner;

public class P4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your sequence of numbers"
				+ " separated by a single space: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split(" ");
		int arraySize = input.length;
		int[] numbers = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		
		System.out.println("Your sequences of increasing numbers "
				+ "are as follows: ");
		System.out.println();
		
		int bestStartPosition = 0;
		int currentStartPosition = 0;
		int bestLength = 1;
		int currentLength = 0;
		
		System.out.print(numbers[0] + " ");
		
		for (int i = 0; i < arraySize - 1; i++) {
			
			if (numbers[i + 1] > numbers[i]) {
				currentLength++;
				System.out.print(numbers[i + 1] + " ");
				
				if (bestLength < currentLength) {
					bestLength = currentLength;
					bestStartPosition = currentStartPosition;
				}
			} else {
				currentLength = 1;
				currentStartPosition = i + 1;
				
				System.out.println();
				System.out.print(numbers[i + 1] + " ");
			}
		}
		
		System.out.println();
		System.out.print("The longest sequence is: ");
		
		int count = 0;
		
		for (int i = 0; i < bestLength; i++) {
			System.out.print(numbers[bestStartPosition + count] + " ");
			count++;
		}
		
		System.out.println();
	}
}