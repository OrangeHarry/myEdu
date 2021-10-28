package com.harry.test;

import java.util.Arrays;

public class StepTest2 {
	public static void main(String[] args) {
		int[] array = { 3, 24, 1, 55, 17, 43, 5 };

		Arrays.sort(array);

		for (int i : array) {
			System.out.printf("%d, ", i);
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d, ", array[i]);
		}
	}
}
