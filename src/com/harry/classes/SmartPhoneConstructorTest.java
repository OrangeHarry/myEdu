package com.harry.classes;

public class SmartPhoneConstructorTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone();
		SmartPhone smartPhone = new SmartPhone("yourSmartPhone");// ��µǴ� ���� ���ⱸ��
		// (������)������ ���ÿ� �����ڿ� ���� �����Ͽ� phoneName�� �����մϴ�.
		System.out.println("smartPhone.phoneName value is [" + smartPhone.phoneName + "]");
	}
}
