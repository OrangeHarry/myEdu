package com.harry.classes;

public class NumUtil {
	static boolean isEvenOdd(int i) {
		if (i % 2 == 0) { // 짝수
			return true;//result boolean을 따로 안넣고 바로 리턴하는게 가능하다.
		} else {//홀수
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
