package com.harry.operator;

public class OperatorPriorityTest {
	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		int z = 3;

		int result = x + y * z; // 곱하기 연산을 먼저한다
		System.out.println("result value is " + result);

		int result2 = (x + y) * z; //더하기를 먼저하고 곱하기를 한다
		System.out.println("result2 value is " + result2);
		
		int result3 = x + (y * z); //꼭 괄호를 해주는 것이 좋습니다.
		System.out.println("result3 value is "+ result3);
	}
}

// 그냥 괄호없는 계산식도 먼저 계산되는 */는 그냥 괄호를 넣어주자 나중에 실무가면 그게 편해