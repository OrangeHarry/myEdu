package com.harry.condition;

public class IfIfTest {
	public static void main(String[] args) {
		char gubun = 'M'; // M:male, F:Female
		int age = 54;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female..age is 20");
			} else {
				System.out.println("Female..afe is not 20");
			}
		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknow case...");
		}
	}
}
//�ڵ� �������� ���ؼ� ����if���� ��������� ������ �ظ��ϸ� �����Ѵ�.