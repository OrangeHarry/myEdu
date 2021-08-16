package com.harry.access;

public class MyPhoneInfo {
	private String phoneNum;
	private int pw;
	public String phoneNickName;

	public MyPhoneInfo() {
		phoneNum = "010-7254-7761";
		pw = 12345;
		phoneNickName = "Orange";
	}

	public void callPhone() {
		System.out.println("callPhone is available");
	}

	private void changePw() {
		System.out.println("changePw is...");
	}

}
