package com.harry.refertype;

public class StringReferTest {
	public static void main(String[] args) {
		String sampleA = new String("Ha"); // newŰ����� �������̼� �޸𸮿� ���� �ø��ٴ��ǹ�
		String sampleB = new String("Ha"); // �׷��Ƿ� �ΰ��� ���� �ٸ� ��ü�̴�
		// �ΰ��� �ٸ� ��ü�� ���� �ּҿ� �ö� �ִ�

//		if (sampleA == sampleB) {
//			System.out.println("sampleA == sampleB");
//		} else {
//			System.out.println("sampleA != sampleB");
//		}

		if (sampleA.equals(sampleB)) { // contetnEqulas()�� �ᵵ �ȴ�(�ڵ��ϼ��ǳ�)
			System.out.println("sampleA sampleB is same");
		} else {
			System.out.println("sampleA sampleB is not same");
		}
	}
}
