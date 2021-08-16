package com.harry.condition;

public class ForContinue02Test {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			if (i != 0) {
				System.out.println(i);
			}
		}
	}
}
