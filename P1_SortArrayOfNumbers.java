package javaCollections;

import java.util.Arrays;
import java.util.Scanner;

public class P1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you will have"
				+ " in your collection: ");
		
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter [%d] in your collection: ", i + 1);
			numbers[i] = scanner.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.println();
		System.out.println("Your sorted collection looks like that: ");
		System.out.println();
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		System.out.println();
	}
}