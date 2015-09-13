package javaCollections;

import java.util.Scanner;

public class P2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your strings separated by"
				+ " a single space: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split(" ");	
		int arraySize = input.length;
		
		System.out.println("Your sequences of equal strings are: ");
		System.out.println();
		
		if (arraySize == 1) {
			System.out.println(input[0]);
		}
		
		for (int i = 0; i < arraySize - 1; i++) {
			System.out.print(input[i] + " ");
			
			while ((i < arraySize - 1) 
					&& input[i].equals(input[i + 1])) {
				System.out.print(input[i + 1] + " ");
				i++;
			}
			
			System.out.println();
		}
		
		if ((arraySize > 1) 
				&& (!(input[arraySize - 1]
						.equals(input[arraySize - 2])))) {
			System.out.println(input[arraySize - 1]);
		}
	}
}