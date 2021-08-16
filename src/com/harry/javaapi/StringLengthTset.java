package com.harry.javaapi;

public class StringLengthTset {
	public static void main(String[] args) {
		String phoneNum = "01072547761";
//		String phoneNum = "07011112222";
//		String phoneNum = "021112222"; 
//		String phoneNum = "0222223333";

		if (phoneNum.length() == 11 && phoneNum.indexOf("010") == 0) {
			System.out.println("SmartPhone number");
		} else if (phoneNum.length() == 11 && phoneNum.indexOf("070") == 0) {
			System.out.println("Internet Phone number");
		} else if (phoneNum.length() < 11 && phoneNum.indexOf("02") == 0) {
			System.out.println("Seoul House Phone number");
		} else {
			System.out.println("Unknown Phone number");
			System.out.println("!!!phoneNum.length value is [" + phoneNum.length() + "]");
			System.out.println("!!!phoneNum valu is [" + phoneNum + "]");
		}
		System.out.println("phoneNum.length value is [" + phoneNum.length() + "]");
		System.out.println("phoneNum value is [" + phoneNum + "]");
	}
}
