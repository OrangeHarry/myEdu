package com.harry.exception;

public class ThrowsClass {
//	public static void findClass() throws ClassNotFoundException {
//		Class class1 = Class.forName("java.lang.StringTwo");// �̷��޼ҵ尡 ���� ������ ClassNotFoundException �߻��մϴ�.
//		// ���⼭ Try Catch�� ���� �ʰ� �� �޼ҵ带 ȣ�� �ϴ� �κп��� Try catch �ϵ��� �� �� ���ϴ�.
//	}
	public void findClass() {
		try {
			Class class1 = Class.forName("java.lang.StringTwo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// �̷� �޼ҵ尡 ���� ������ ClassNotFoundException �߻��մϴ�.
		//���⼭ Try Catch�� ���� �ʰ� �� �޼ҵ带 ȣ�� �ϴ� �κп��� Try catch �ϵ��� �� �� ���ϴ�.
	}
}
