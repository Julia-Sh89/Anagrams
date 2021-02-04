package org.julia.foxminded;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AnagramTest {

	public Anagram anagram = new Anagram();

	@Test
	public void givenNull_whenGetAnagram_thenThrowsException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			anagram.getAnagram(null);
		  });
	}

	@Test
	void givenSimpleWord_whenGetAnagram_thenReversedWord() {
		assertEquals("abcde", anagram.getAnagram("edcba"));
	}

	@Test
	void givenWordWithSymbols_whenGetAnagram_thenReversedOnlyLetters() {
		assertEquals("ab2c1@kj%", anagram.getAnagram("jk2c1@ba%"));
	}

	@Test
	void givenSymbols_whenGetAnagram_thenNotReversed() {
		assertEquals("*75)(4", anagram.getAnagram("*75)(4"));
	}

	@Test
	void givenSimpleText_whenGetAnagram_thenReversedAllWords() {
		assertEquals("olleH sdlrow", anagram.getAnagram("Hello worlds"));
	}

	@Test
	void givenTextWithSymbols_whenGetAnagram_thenReversedOnlyLetters() {
		assertEquals("oll2eH1 sdl!ro$w", anagram.getAnagram("Hel2lo1 wor!ld$s"));
	}

	@Test
	void givenTextOnlySymbols_whenGetAnagram_thenNotReversed() {
		assertEquals("878$^(1 9897)((", anagram.getAnagram("878$^(1 9897)(("));
	}

}
