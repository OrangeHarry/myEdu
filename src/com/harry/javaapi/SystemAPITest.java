package com.harry.javaapi;

public class SystemAPITest {
	public static void main(String[] args) {
		System.out.println("My OS is [" + System.getProperty("os.name") + "]");
		System.out.println("My Java version is [" + System.getProperty("java.version") + "]");

		for (int i = 0; i < 1000; i++) {// õ��
			System.out.println("counter is " + i);
			if (i == 799) {// �ȹ��
				System.out.println("counter is [" + i + "]gc!");
			} else if (i == 899) {// �����
				System.out.println("counter is [" + i + "]Exit!");
				System.exit(0);
			} else {

			}
		}
	}
}
//System.getProperty("os.name"); �ý��� ������Ƽ �б� OS
//System.getProperty("java.version"); �ý��� ������Ƽ �б� Java Version 
//System.exit(0); ���α׷��� ��������
//System.gc(): �ý��ۿ��� �޸� Ȯ��.
