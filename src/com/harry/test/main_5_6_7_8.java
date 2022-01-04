package com.harry.test;

public class main_5_6_7_8 {
	public static void main(String[] args) {
		CodingTest6 ct = new CodingTest6();
		long ct6 = ct.solution(6, 12);
		System.out.println(ct6);
		System.out.println("===============================");
		CodingTest5 test = new CodingTest5();
		long[] ct5 = test.solution(6, 3);
		for(int i=0; i<ct5.length; i++) {
			System.out.println(ct5[i]);
		}
		System.out.println("===============================");
		
		CodingTest7 test7 = new CodingTest7();
		System.out.println(test7.solution("01076898562"));
		System.out.println(test7.solution("027688562"));
		System.out.println("===============================");
		
		CodingTest8 test8 = new CodingTest8();
		int[] arr = {82, 44, 55, 68, 20, 44, 79, 65};
		System.out.println(test8.solution(arr));
		System.out.println("===============================");
	}
}
