package javaCollections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P7_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String input = scanner.nextLine();
		
		System.out.println("Enter your substring here: ");
		System.out.println();
		
		String match = scanner.nextLine();
		int substringFoundCounter = 0;
		
		Pattern pattern = Pattern.compile(match.toLowerCase());
		Matcher matcher = pattern.matcher(input.toLowerCase());
		
		while (matcher.find()) {
			substringFoundCounter++;
		}
		
		System.out.printf("Your substring can be found %d "
				+ "times in the input text", substringFoundCounter);
		System.out.println();
	}
}