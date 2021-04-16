package com.he.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class VCPairTest {
	private static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	private static Consumer<String> findAndPrintVCPair=strInput->{
		char ch[] = strInput.toLowerCase().toCharArray();
		int idx=0;
		for(int i=0;i<ch.length-1;i++) {			
			if(!vowels.contains(ch[i])
					&& vowels.contains(ch[i+1])) {
				 idx++;
			}
		}
		
		System.out.println(idx);
	};

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String tn = br.readLine();
			for (int i = 0; i < Integer.parseInt(tn); i++) {
				br.readLine();
				findAndPrintVCPair.accept(br.readLine());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}                

	}

}
