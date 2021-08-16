package com.harry.condition;

public class IfScoreTest {
	public static void main(String[] args) {
		int score = 40;
		char grade = ' ';// A,B,C,D

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Your grade is [" + grade + "]");
	}
}
