package com.harry.exception;

public class CustomException extends Exception {// ����� ���� Exception�� ������� Exception�� ��ӹ޽��ϴ�.

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("CustomException OK");
	}

	public CustomException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		System.out.println("CustomException(String arg0) OK");
	}

}
