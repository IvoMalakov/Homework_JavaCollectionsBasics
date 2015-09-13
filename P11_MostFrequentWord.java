package javaCollections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text here: ");
		System.out.println();
		
		String[] input = scanner.nextLine().split("[\\W]+");
		
		Map<String, Integer> countedWords = new TreeMap<>();
		
		for (String word : input) {
			Integer count = countedWords.get(word);
			
			if (count == null) {
				count = 0;
			}
			
			countedWords.put(word.toLowerCase(), count + 1);
		}
		
		int maxValue = 0;
		
		for (Integer integer : countedWords.values()) {
			
			if (integer > maxValue) {
				maxValue = integer;
			}
		}
		
		for (Map.Entry<String, Integer> stringIntegerEntry : countedWords.entrySet()) {
			
			if (stringIntegerEntry.getValue() == maxValue) {
				System.out.println(stringIntegerEntry.getKey() + 
						" -> " + maxValue + " times");
			}
		}
	}
}