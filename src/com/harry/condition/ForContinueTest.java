package com.harry.condition;

public class ForContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {//나머지가 없다. 2로 나누어 떨어진다. 짝수
				continue; //짝수면 아래로 이동하지 않고 다시 조건문을 타고 계속된다는 뜻.
			}
			System.out.println(i);
		}
	}
}
