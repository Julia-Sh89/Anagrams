package org.julia.foxminded;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Anagram anagram = new Anagram();
		String reverseText = anagram.getAnagram(scanner.nextLine());
		System.out.println(reverseText);
		scanner.close();
	}
}