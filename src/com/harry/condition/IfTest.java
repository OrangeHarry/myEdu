package com.harry.condition;

public class IfTest {
	public static void main(String[] args) {
		int mathScore = 87;

		if (mathScore > 50) {
			System.out.println("mathScore is > 50");
		}
		if (mathScore == 51) {
			System.out.println("mathScore is 51");
		}
		if (mathScore > 80) {
			System.out.println("mathScore is >80");
		}
		System.out.println("main method is end"); //위의 if절과 전혀 상관없음
	}
}
//코드를 줄인다고 if쓸때 {이거 빼먹지말자 절대로 그러면 안되!!