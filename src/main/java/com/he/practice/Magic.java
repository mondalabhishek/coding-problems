package com.he.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Magic {

	private static Consumer<String> findMagicIdx = inputStr -> {
		List<String> inputList = Arrays.asList(inputStr.split(" "));
		List<BigInteger> numbers = inputList.stream().map(Long::parseLong).map(BigInteger::valueOf).sorted()
				.collect(Collectors.toList());
		System.out.println("Length ::" + numbers.size());
		boolean found = false;
		Optional<BigInteger> total = numbers.stream().reduce(BigInteger::add);
		if (total.isPresent()) {
			for (int i = 0; i < numbers.size(); i++) {
				if ((total.get().subtract(numbers.get(i))).
						mod(new BigInteger("7")).compareTo(BigInteger.ZERO) == 0) {
					found = true;
					System.out.println(inputList.indexOf(numbers.get(i).toString()));
					break;
				}
			}
		}

		if (!found) {
			System.out.println("-1");
		}

	};

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String input = br.readLine();
			findMagicIdx.accept(br.readLine());

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
