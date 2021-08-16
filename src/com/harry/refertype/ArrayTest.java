package com.harry.refertype;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ages = { 10, 20, 30, 40 }; // Array선언과 생성타입1
		int score[] = { 100, 90, 80, 70 };// Array선언과 생성타입2 왠만하면 이걸로 쓰자

//		System.out.println("ages[0] value is " + ages[0]);
//		System.out.println("ages[1] value is " + ages[1]);
//		System.out.println("ages[2] value is " + ages[2]);
//		System.out.println("ages[3] value is " + ages[3]);
//
//		System.out.println("score[0] value is " + score[0]);
//		System.out.println("score[1] value is " + score[1]);
//		System.out.println("score[2] vaiue is " + score[2]);
//		System.out.println("score[3] value is " + score[3]);
//		
//		System.out.println("score[4] value is "+score[4]);//배열에 없는 수를 출력하려하면 안나오지

		System.out.println("ages.length value is " + ages.length);
		for (int i = 0; i < ages.length; i++) {
			System.out.println("ages[" + i + "] value is " + ages[i]);
		}
		System.out.println("-----------------------------");

		System.out.println("score.length value is " + score.length);
		for (int j = 0; j < score.length; j++) {
			System.out.println("score[" + j + "] value is " + score[j]);
		}
	}
}
