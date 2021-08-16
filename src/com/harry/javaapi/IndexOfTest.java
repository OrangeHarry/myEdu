package com.harry.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "Korea Fighting!";

		int indicator = word.indexOf("Fighting");
		System.out.println("indicator value is " + indicator);

		if (word.indexOf("Korea") != 1) {// index는 0부터 시작한다. -1은 값이 없을때 리턴한다.
			System.out.println("Find OK");
		} else {
			System.out.println("Not Find");
		}
	}
}
//둘다 몇번째 글자 수만 맞으면 된다는 얘긴가
