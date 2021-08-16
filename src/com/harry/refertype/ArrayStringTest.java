package com.harry.refertype;

public class ArrayStringTest {
	public static void main(String[] args) {
		String names[] = { "Ã¶¼ö", "¿µÈñ", "±æµ¿", "Çå¹Î" };

		System.out.println("names.length value is " + names.length);

		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);
		System.out.println("names[3] value is " + names[3]);

		System.out.println("--------------------");

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] value is " + names[i]);
		}
	}
}
