package javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P9_CombineListOfLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first list of letters "
				+ "separated by a single space: ");
		System.out.println();
		
		char[] firstListAsCharArray = scanner
				.nextLine()
				.replaceAll(" ", "")
				.toCharArray();
		
		System.out.println("Enter your second list of letters "
				+ "separated by a single space: ");
		System.out.println();
		
		char[] secondListAsCharArray = scanner
				.nextLine()
				.replaceAll(" ", "")
				.toCharArray();
		
		List<Character> outputList = new ArrayList<>();
		List<Character> tempList = new ArrayList<>();
		
		for (char firstChar : firstListAsCharArray) {
			outputList.add(firstChar);
			tempList.add(firstChar);
		}
		
		for (char secondChar : secondListAsCharArray) {
			
			if (!(tempList.contains(secondChar))) {
				outputList.add(secondChar);
			}
		}
		
		System.out.println("Your combined list is as follows: ");
		System.out.println();
		
		for (Character outputChar : outputList) {
			System.out.print(outputChar + " ");
		}
		
		System.out.println();
	}
}