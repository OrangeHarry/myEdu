package com.harry.datatype;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println("CastingTest");

		char inValue = '��'; // casting char to int
		int outResult = inValue;
		System.out.println("�� to int value is [" + outResult + "]");

		int inValue02 = 12594;
		char outResult02 = (char) inValue02;//ū ũ�⿡�� ����ũ��� ��ȯ�̶�(char)�� ����
		System.out.println("12594 to char value is[" + outResult02 + "]");
	}
}
