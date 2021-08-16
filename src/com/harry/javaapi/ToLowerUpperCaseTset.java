package com.harry.javaapi;

public class ToLowerUpperCaseTset {
	public static void main(String[] args) {
		String string = "I am a boy";

		String toLower = string.toLowerCase();
		String toUpper = string.toUpperCase();

		System.out.println("toLower value is [" + toLower + "]");//모두 소문자로
		System.out.println("toUpper value is [" + toUpper + "]");//모두 대문자로
	}
}
