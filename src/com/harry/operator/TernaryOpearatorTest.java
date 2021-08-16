package com.harry.operator;

public class TernaryOpearatorTest {
	public static void main(String[] args) {
		int gilDongAge = 29;

		char isAdult = (gilDongAge > 20) ? 'T' : 'F'; // 성인여부 확인 로직

		System.out.println("gilDongAge isAdult value is [" + isAdult + "]");
	}
}
