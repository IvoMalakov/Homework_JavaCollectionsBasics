package javaCollections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split("[\\W]+");
		
		System.out.println("The words of your text "
				+ "in aphabetical order are, as follows: ");
		System.out.println();
		
		Set<String> output = new TreeSet<>();
		
		for (String word : input) {
			output.add(word.toLowerCase());
		}
		
		for (String word : output) {
			System.out.print(word + " ");
		}
		
		System.out.println();
	}
}