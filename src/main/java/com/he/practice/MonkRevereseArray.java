package com.he.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiConsumer;

public class MonkRevereseArray {
	
	private static BiConsumer<Integer, String[]> rotate = (k, ir)->{
		StringBuilder finalArray = new StringBuilder();
		
		
		
	    for (int i = (k*-1); i < ir.length-k; i++) {
	       System.out.println(i);
	    }
		
		//Get the remainder if being rotate more than array length
		if(k>ir.length) {
			k=k%ir.length;
		}
		
		/*
		 * for(int idx=0;idx<ir.length;idx++) { int ni = k-idx; if(ni<0) { ni =ni*-1;
		 * }else if(ni>0) { ni = ir.length- ni; }
		 * 
		 * if(finalArray.length()>0) { finalArray.append(" "); }
		 * finalArray.append(ir[ni]); }
		 * 
		 * System.out.println(finalArray);
		 */
	};


	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String tn = br.readLine();
			for (int i = 0; i < Integer.parseInt(tn); i++) {
				String spec = br.readLine();
				int k = Integer.parseInt(spec.split(" ")[1]);
				String ir[] = br.readLine().split(" ");
				rotate.accept(k,ir);
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
