package com.harry.refertype;

public class ArrayDynamic02Test {
	public static void main(String[] args) {

		String names[] = new String[5]; // �̿Ͱ��� ���·� ���� ���ȴ�.

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
