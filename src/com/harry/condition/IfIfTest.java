package com.harry.condition;

public class IfIfTest {
	public static void main(String[] args) {
		char gubun = 'M'; // M:male, F:Female
		int age = 54;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female..age is 20");
			} else {
				System.out.println("Female..afe is not 20");
			}
		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknow case...");
		}
	}
}
//코드 가독성을 위해서 이중if문은 허용하지만 삼중은 왠만하면 허용안한다.