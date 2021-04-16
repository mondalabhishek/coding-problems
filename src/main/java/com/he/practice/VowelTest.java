package com.he.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class VowelTest {

	private static Set<Character> filter = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	private static Consumer<String> checkForVowels = str -> {

		if (str.toLowerCase().chars().filter(i -> filter.contains((char) i)).distinct().count() == 5) {
			System.out.println("lovely string");
		} else {
			System.out.println("ugly string");
		}
	};

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String input = br.readLine();
			for (int i = 0; i < Integer.parseInt(input); i++) {
				checkForVowels.accept(br.readLine());
			}

		} catch (IOException e) {
			System.err.println("An exception occured");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
