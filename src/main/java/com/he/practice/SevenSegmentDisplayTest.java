package com.he.practice;

import java.io.BufferedReader;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class SevenSegmentDisplayTest {

	public static void main(String[] args) {
		Map<Character, Integer> stickMap = new HashMap<>();
		stickMap.put('0', 6);
		stickMap.put('1', 2);
		stickMap.put('2', 5);
		stickMap.put('3', 5);
		stickMap.put('4', 4);
		stickMap.put('5', 5);
		stickMap.put('6', 6);
		stickMap.put('7', 3);
		stickMap.put('8', 7);
		stickMap.put('9', 6);

		Consumer<String> findMaxPrint = str -> {
			int totalStick=0;
			for(char ch: str.toCharArray()) {
				totalStick = totalStick+stickMap.get(ch);
			}
			
			if(totalStick%2==0) {
				System.out.println(generate(() -> "1").limit(totalStick/2).collect(joining()));
			}else if (totalStick==3){
				System.out.println("7");
			}
			else {
				System.out.println("7"+generate(() -> "1").limit((totalStick-3)/2).collect(joining()));
			}
		};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String tn = br.readLine();

			for (int i = 0; i < Integer.parseInt(tn); i++) {
				findMaxPrint.accept(br.readLine());
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
