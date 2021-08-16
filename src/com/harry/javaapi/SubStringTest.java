package com.harry.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01072547761";

		String lastNum4 = string.substring(7, 11); // 잘라낼 문자열의 시작 index, 끝날 index를 넣어줍니다.
		System.out.println("휴대전화 뒷자리 4자리의 값은[" + lastNum4 + "]" + "입니다.");

		String theOtherNum = string.substring(3);// index3이후 모두자르기//index3까지 자르는거잖아!!
		System.out.println(theOtherNum);
	}
}
//lastIndex는 이하가 아니라 미만이다