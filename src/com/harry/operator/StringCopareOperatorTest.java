package com.harry.operator;

public class StringCopareOperatorTest {
	public static void main(String[] args) {
		String name01 = "�����";
		String name02 = "�����";
		String name03 = new String("�����"); // �ٸ� �ּ� ������ ����, �������̼� �� ��ü(�и��� ��ü)

		System.out.println(name01 == name02);
		System.out.println(name01 == name03);
		System.out.println(name02 == name03);

		System.out.println("-----------------");

		System.out.println(name01.equals(name02));
		System.out.println(name01.equals(name03));
		System.out.println(name02.equals(name03));
	}
}
