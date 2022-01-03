package com.harry.test;

public class main_5_6 {
	public static void main(String[] args) {
		CodingTest6 ct = new CodingTest6();
		long ct6 = ct.solution(6, 12);
		System.out.println(ct6);
		
		CodingTest5 test = new CodingTest5();
		long[] ct5 = test.solution(6, 3);
		for(int i=0; i<ct5.length; i++) {
			System.out.println(ct5[i]);
		}
	}
}
