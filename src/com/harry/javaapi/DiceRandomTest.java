package com.harry.javaapi;

public class DiceRandomTest {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 6) + 1;
		System.out.println("Dice value is [" + number + "]");
	}
}

