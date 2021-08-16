package com.harry.access;

public class MyPhoneInfoTest {
	public static void main(String[] args) {
		MyPhoneInfo myPhoneInfo = new MyPhoneInfo();
//		myPhoneInfo.phoneNum = "01-7777-8888";
//		myPhoneInfo.pw = 12346;
		myPhoneInfo.phoneNickName = "Apple";

		System.out.println("myPhoneInfo.phoneNickNmae value is [" + myPhoneInfo.phoneNickName + "]");

		myPhoneInfo.callPhone();
//		myPhoneInfo.changePw();
	}
}
