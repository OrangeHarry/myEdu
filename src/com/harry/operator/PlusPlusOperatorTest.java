package com.harry.operator;

public class PlusPlusOperatorTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		System.out.println("x value is " + x); // �ñ��ؼ� �־ ����
		
		int result = ++x + 1; // ���� x�� ������Ű�� ����
		int result2 = y++ + 1; // ������ �����ϰ� y�� ����
		System.out.println("result value is " + result);
		System.out.println("result2 value is " + result2);

		System.out.println("-----------------------------------------");

		System.out.println("x value is " + x); // ���������� ������ ��� +1 ���� �Ǿ� �ֽ��ϴ�.
		System.out.println("y value is " + y);

	}
}
