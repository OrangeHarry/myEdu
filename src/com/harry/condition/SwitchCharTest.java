package com.harry.condition;

public class SwitchCharTest {
	public static void main(String[] args) {
		char alphbet = 'b';

		switch (alphbet) {
		case 'A':
			System.out.println("alphbet is A");
			break;
		case 'B':
			System.out.println("alphbet is B");
			break;
		case 'C':
			System.out.println("alphbet is C");
			break;
		default:
			System.out.println("alphbet is D~Z");
		}
	}
}
