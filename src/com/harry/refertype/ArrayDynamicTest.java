package com.harry.refertype;

public class ArrayDynamicTest {
	public static void main(String[] args) {
		// 사용할 개수를 정의하고 해당값을 먼저 넣을 수 있다.
		String[] names = null;
		names = new String[5];

		names[0] = "민수";
		names[1] = "칠수";
		names[2] = "헌민";
		names[3] = "갑수";
		names[4] = "대수";

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] value is " + names[i]);
		}
	}
}
