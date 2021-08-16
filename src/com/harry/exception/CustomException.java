package com.harry.exception;

public class CustomException extends Exception {// 사용자 정의 Exception을 만드려면 Exception을 상속받습니다.

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
