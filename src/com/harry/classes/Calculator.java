package com.harry.classes;

public class Calculator {
	// �޼ҵ� method : �Ʒ��� ���� ���·� �����Ѵ�.
	int plus(int x, int y) {// ���� ���� ������, �Ű������� 2��
		int result = 0;
		result = x + y;

		return result;
	}
	int minus(int x, int y) {
		int result = 0;
		result = x-y;
		
		return result;
	}

	String getName() {// ���ϰ��� String
		String result = "MyCalculor";

		return result;
	}

	boolean isBateryEmpty() {// ���ϰ��� boolean
		return false;
	}

	void setFactoryInit() {// ���ϰ��� ����
		System.out.println("--------Calculator is Factory Init-------");
	}
}
