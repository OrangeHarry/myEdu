package com.harry.condition;

public class IfIfIfTest {
	public static void main(String[] args) {
		char gubun = 'M';// M:male, F:Female
		int age = 25;
		boolean join = true;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female..age is 20");
				if (join) {// 이렇게 3중 사용하는 것을 금지한다, 가독성 떨어짐
					System.out.println("Female..age is 20 join true");
				} else {
					System.out.println("Female..age is 20 join false");
				}
			} else {
				System.out.println("Female..age is not 20");
			}
		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknown case..");
		}
	}
}
