package com.harry.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "Korea Fighting!";

		int indicator = word.indexOf("Fighting");
		System.out.println("indicator value is " + indicator);

		if (word.indexOf("Korea") != 1) {// index�� 0���� �����Ѵ�. -1�� ���� ������ �����Ѵ�.
			System.out.println("Find OK");
		} else {
			System.out.println("Not Find");
		}
	}
}
//�Ѵ� ���° ���� ���� ������ �ȴٴ� ��䰡
