package com.harry.javaapi;

public class SystemAPITest02 {
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;

		System.out.println("My OS is [" + System.getProperty("os.name") + "]");
		System.out.println("My Java version is [" + System.getProperty("java.version") + "]");

		for (int i = 0; i < 9999999; i++) {// õ����
			System.out.println("counter is " + i);
			if (i == 0) {
				startTime = System.currentTimeMillis();
			} else if (i == 799) {// /�ȹ��
				System.out.println("counter is [" + i + "]gc!");
				System.gc();
			} else if (i == 899999) {// ���鸸���� �ƴ϶� ���ʸ����ε�...��.��
				endTime = System.currentTimeMillis();
				System.out.println("�ҿ�ð��� " + (endTime - startTime) / 1000 + "��");
				// �и���ũ �����Դϴ�. �ʸ����Ϸ��� 1000���� ����������մϴ�.
				System.out.println("counter is [" + i + "]Exit!");
				System.exit(0);
			} else {

			}
		}
	}
}
