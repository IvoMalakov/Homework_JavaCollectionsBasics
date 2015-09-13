package javaCollections;

import java.util.Scanner;

public class P5_CountAllWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split("[\\W]+");
		int wordsCounter = input.length;
		
		System.out.println();
		System.out.printf("Your text contains %d words", wordsCounter);
	}
}