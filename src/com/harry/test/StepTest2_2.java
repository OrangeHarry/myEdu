package com.harry.test;

import java.util.Arrays;

public class StepTest2_2 {

	public int[] ascending(int[] inputNumbers) {
		int[] arr = inputNumbers;
		Arrays.sort(arr);

		return arr;
	}

	public static void main(String[] args) {
		StepTest2_2 util = new StepTest2_2();
		int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };

		numbers = util.ascending(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i != numbers.length - 1) {
				System.out.print(" ");
			} else {
				System.out.println("");
			}
		}
		System.out.println("Successful!!");

	}
}
