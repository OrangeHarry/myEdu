package com.harry.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01072547761";

		String lastNum4 = string.substring(7, 11); // �߶� ���ڿ��� ���� index, ���� index�� �־��ݴϴ�.
		System.out.println("�޴���ȭ ���ڸ� 4�ڸ��� ����[" + lastNum4 + "]" + "�Դϴ�.");

		String theOtherNum = string.substring(3);// index3���� ����ڸ���//index3���� �ڸ��°��ݾ�!!
		System.out.println(theOtherNum);
	}
}
//lastIndex�� ���ϰ� �ƴ϶� �̸��̴�