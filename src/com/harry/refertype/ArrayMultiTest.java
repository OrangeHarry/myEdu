package com.harry.refertype;

public class ArrayMultiTest {
	public static void main(String[] args) {
		String[][] custList = { { "Ã¶¼ö", "±è¹Î¼ö", "Á¦°¥°ø¸í" }, { "¿µÈñ", "ÀÌ´ÙÈñ", "µ¶°í¼öÁø", "ÇÑÀÌ»Ý»õ·Ò" } };

		System.out.println("custList.length value is " + custList.length);
		System.out.println("custList.length[0] value is " + custList[0].length);
		System.out.println("custList.length[1] value is " + custList[1].length);

		System.out.println("=======================================");
		System.out.println("custList[0][0] value is " + custList[0][0]);
		System.out.println("custList[0][1] value is " + custList[0][1]);
		System.out.println("custList[0][2] value is " + custList[0][2]);
		System.out.println("--------------------------------------");
		System.out.println("custList[1][0] value is " + custList[1][0]);
		System.out.println("custList[1][1] value is " + custList[1][1]);
		System.out.println("custList[1][2] value is " + custList[1][2]);
		System.out.println("custList[1][3] value is " + custList[1][3]);
		System.out.println("======================================");

		System.out.println("======================================");
		for (int i = 0; i < custList.length; i++) {
			for (int j = 0; j < custList[i].length; j++) {
				System.out.println("for custList[" + i + "][" + j + "] value is " + custList[i][j]);
			}
		}
	}
}
