package com.harry.refertype;

public class ArrayDynamic02Test {
	public static void main(String[] args) {

		String names[] = new String[5]; // 이와같은 형태로 많이 사용된다.

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
