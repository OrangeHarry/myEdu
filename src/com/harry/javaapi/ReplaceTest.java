package com.harry.javaapi;

public class ReplaceTest {
	public static void main(String[] args) {
		String originStr = "Java Study Now";
		String tobeStr = originStr.replace("Now", "Yesterday");

		System.out.println(originStr);
		System.out.println(tobeStr);

	}
}
