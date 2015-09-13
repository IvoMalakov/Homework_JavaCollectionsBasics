package javaCollections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P8_ExtractEmails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String input = scanner.nextLine();
		
		System.out.println("I found these emails in your text: ");
		System.out.println();
		
		Pattern pattern = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
			    Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}