package com.harry.refertype;

public class ArraySeperateTest {
	public static void main(String[] args) {
		// 배열에서 선언과 생성을 분리합니다.

		// 아래와 같이 분리하면 편집기 에러가 발생한다
//		String[ names;
//		names= {"철수","영희","길동"};

		// 선언과 생성의 분리는 new를 사용하여 줍니다.
		String[] names = null; // null로 초기화해줍니다. 메모리에 이점이 있습니다.
		names = new String[] { "철수", "영희", "길동" };

		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);

		System.out.println("names.length value is " + names.length);//배열의 개수를 가져옵니다.

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] value is " + names[i]);
		}
	}
}
