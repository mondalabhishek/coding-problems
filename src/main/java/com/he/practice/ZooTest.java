package com.he.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZooTest {	

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String input = br.readLine();
			char[] ch=input.toCharArray();
			int countZ=0;
			int countO=0;
			char currentStream = 'z';
			boolean interrupted = false;
			if(ch[0]!='z') {
				System.out.println("No");
			}else {
				for(int i=0;i<ch.length;i++) {
					if(i!=0 && currentStream=='o' && ch[i]!='o') {
						System.out.println("No");
						interrupted = true;
						break;
					}
					if(ch[i]=='z') {
						countZ++;
					}else {
						currentStream = 'o';
						countO++;
					}
				}
				
				if(!interrupted) {
					
					System.out.println((2*countZ)==countO?"Yes":"No");
				}
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
