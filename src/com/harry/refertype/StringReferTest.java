package com.harry.refertype;

public class StringReferTest {
	public static void main(String[] args) {
		String sampleA = new String("Ha"); // new키워드는 델리게이션 메모리에 새로 올린다는의미
		String sampleB = new String("Ha"); // 그러므로 두개는 각기 다른 객체이다
		// 두개가 다른 객체로 가른 주소에 올라가 있다

//		if (sampleA == sampleB) {
//			System.out.println("sampleA == sampleB");
//		} else {
//			System.out.println("sampleA != sampleB");
//		}

		if (sampleA.equals(sampleB)) { // contetnEqulas()로 써도 된다(자동완성되네)
			System.out.println("sampleA sampleB is same");
		} else {
			System.out.println("sampleA sampleB is not same");
		}
	}
}
