package com.harry.operator;

public class SingleSignOperatorTest {
	public static void main(String[] args) {

		int x = -1;
		int result = +x; // 상태유지
		int result2 = -x;// 상태변경
		System.out.println("result value is " + result);
		System.out.println("result2 value is " + result2);
		
		System.out.println("----------------------------------");

		int y = 1;
		int result3 = +y;
		int result4 = -y;
		System.out.println("result3 value is " + result3);
		System.out.println("result4 value is " + result4);
	}
}
