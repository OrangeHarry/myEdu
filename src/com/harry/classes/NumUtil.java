package com.harry.classes;

public class NumUtil {
	static boolean isEvenOdd(int i) {
		if (i % 2 == 0) { // ¦��
			return true;//result boolean�� ���� �ȳְ� �ٷ� �����ϴ°� �����ϴ�.
		} else {//Ȧ��
			return false;
		}
	}

	static boolean isTwoNumCopare(int x, int y) {
		if ((x - y) >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
