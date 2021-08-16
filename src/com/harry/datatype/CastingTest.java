package com.harry.datatype;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println("CastingTest");

		char inValue = 'ㄲ'; // casting char to int
		int outResult = inValue;
		System.out.println("ㄲ to int value is [" + outResult + "]");

		int inValue02 = 12594;
		char outResult02 = (char) inValue02;//큰 크기에서 작은크기로 변환이라(char)이 들어간다
		System.out.println("12594 to char value is[" + outResult02 + "]");
	}
}
