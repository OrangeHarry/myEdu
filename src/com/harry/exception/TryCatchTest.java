package com.harry.exception;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("java.lang.StringTwo");// �̷� �̸��� �ִ��� �˻��մϴ�.

		} catch (ClassNotFoundException e) {
			e.printStackTrace();// ���ܻ󼼸� �ܼ� ȭ�鿡 ǥ�� �Ͽ� �� �� �ֽ��ϴ�.
			System.out.println("Class not exsist");
		}
	}
}
