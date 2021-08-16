package com.harry.operator;

public class PlusPlusOperatorTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		System.out.println("x value is " + x); // 궁금해서 넣어본 라인
		
		int result = ++x + 1; // 먼저 x를 증가시키고 연산
		int result2 = y++ + 1; // 연산을 먼저하고 y를 증가
		System.out.println("result value is " + result);
		System.out.println("result2 value is " + result2);

		System.out.println("-----------------------------------------");

		System.out.println("x value is " + x); // 최종적으로 값들은 모두 +1 증가 되어 있습니다.
		System.out.println("y value is " + y);

	}
}
