package org.julia.foxminded;

public class Anagram {

	static final String SPLITTER = " ";

	public String getAnagram(String text) {
		if(text == null) {
			throw new IllegalArgumentException("Введенная строка пустая");
		}
		
		String[] words = text.split(SPLITTER);
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (result.length() > 0) {
				result.append(SPLITTER);
			}
			result.append(reverseWord(word));
		}

		return result.toString();
	}

	private String reverseWord(String word) {
		char[] symbols = word.toCharArray();

		int leftIndex = 0;
		int rightIndex = symbols.length - 1;

		while (leftIndex < rightIndex) {
			if (!Character.isLetter(symbols[leftIndex])) {
				leftIndex++;
			} else if (!Character.isLetter(symbols[rightIndex])) {
				rightIndex--;
			} else {
				char tempChar = symbols[rightIndex];
				symbols[rightIndex] = symbols[leftIndex];
				symbols[leftIndex] = tempChar;
				leftIndex++;
				rightIndex--;
			}
		}
		return String.valueOf(symbols);
	}

}
