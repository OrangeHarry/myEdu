package com.harry.refertype;

public class ArrayDynamicTest {
	public static void main(String[] args) {
		// ����� ������ �����ϰ� �ش簪�� ���� ���� �� �ִ�.
		String[] names = null;
		names = new String[5];

		names[0] = "�μ�";
		names[1] = "ĥ��";
		names[2] = "���";
		names[3] = "����";
		names[4] = "���";

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] value is " + names[i]);
		}
	}
}
