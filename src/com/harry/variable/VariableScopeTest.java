package com.harry.variable;

public class VariableScopeTest {
	public static void main(String[] args) {
		System.out.println("Variable Scop Test");

		int a = 10;
		int b = 20;
		int c = 0;
		int result = 0;

		if (a > 0) {
			 c = 30;
			 result = a + b + c;

		}

		System.out.println("c value is [" + c + "]");
		System.out.println("result value is [" + result + "]");

	}

}
