package com.harry.condition;

public class SwitchChar02Test {
	public static void main(String[] args) {
		char alphbet = 'C';

		switch (alphbet) {
		case 'A':
		case 'B':
			System.out.println("alphbet is A or B");
			break;
		case 'C':
			System.out.println("alphbet is C");
		default:
			System.out.println("alphbet is D~Z");
			break;
		}
	}
}
