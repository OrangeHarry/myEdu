package com.harry.classes;

public class SmartPhone {
	String phoneName = "none";

	// public SmartPhone() {
//		
//	}

	// public SmartPhone() {
//		super();
//		// TODO Auto-generated constructor stub
//		phoneName = "myPhone";
//		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);
//	}
//	public SmartPhone(String name) {//�Ű������� String�� ������ String������ ������ �°� ���� �˾Ƽ� ���̹� �ϸ�ȴ�
//		phoneName = name;//�� String���� �ʵ忡 �ִ´�.
//		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);
//
//	}

	public SmartPhone(String phoneName) {// �̸��� phoneName���� ������, �ʵ���� �ƴ϶� �޾ƿ��°��̾�!!
		super(); // ���� class ��Ī
		this.phoneName = phoneName; // �޾ƿ� ���� �ʵ��� ���� �����ϱ� ���Ͽ� this�� �ִ°�(�ڵ��ϼ� ¯¯!!)
		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);// ��� �����Է�

	}

}
