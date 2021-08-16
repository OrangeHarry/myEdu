package com.harry.classes;

public class NumUtilTest {
	public static void main(String[] args) {
		System.out.println("NumUtil isEvenOdd(6) value is [" + NumUtil.isEvenOdd(6) + "]");
		System.out.println("NumUtil isEvenOdd(5) value is [" + NumUtil.isEvenOdd(5) + "]");
		System.out.println("NumUtil isTwoNumCompare(9,12) value is [" + NumUtil.isTwoNumCopare(9, 12) + "]");
		System.out.println("NumUtil isTwoNumCompare(5,5) value is [" + NumUtil.isTwoNumCopare(5, 5) + "]");
		System.out.println("NumUtil isTwoNumCompare(12,9) value is [" + NumUtil.isTwoNumCopare(12, 9) + "]");
	}
}
//static 많이 쓰면 앱의 초기로딩시간이 길어진다....