package javaCollections;

import java.util.Scanner;

public class P6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split("[\\W]+");
		
		System.out.println("Enter your target word here: ");
		System.out.println();
		
		String targetWord = scanner.nextLine();
		int targetWordCounter = 0;
		
		for (String word : input) {
			if (word.toLowerCase().equals(targetWord.toLowerCase())) {
				targetWordCounter++;
			}
		}
		
		System.out.printf("Your target word can be found %d "
				+ "times in the input text", targetWordCounter);
		System.out.println();
	}
}