package com.harry.javaapi;

public class ToLowerUpperCaseTset {
	public static void main(String[] args) {
		String string = "I am a boy";

		String toLower = string.toLowerCase();
		String toUpper = string.toUpperCase();

		System.out.println("toLower value is [" + toLower + "]");//��� �ҹ��ڷ�
		System.out.println("toUpper value is [" + toUpper + "]");//��� �빮�ڷ�
	}
}
