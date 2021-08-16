package com.harry.condition;

public class DoWhileTest {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println("do while count value is " + count);
			count++;
		} while (count < 11); // 이 조건이 만족될 때 do쪽이 수행 된다.
	}
}
