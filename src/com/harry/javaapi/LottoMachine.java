package com.harry.javaapi;

import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
	static boolean OneTimePlug = true; // ��÷��ȣ 1ȸ�� ���
	static int[] winNumber = new int[6];

	public static void main(String[] args) {
		int getCount = 0;

		for (int i = 0; i < 100000000; i++) {// 1�����
			getCount++;
			System.out.println("getCount value is " + getCount + "===========================");
			if (LottoProcess() == true) {// ���� 1ȸ 1õ���� ����
				getCount++;
				System.out.println("getCount win value is " + getCount + "=======================");
				return;
			}
		}

	}

	public static boolean LottoProcess() {
		boolean winOk;

		int[] selectNumber = new int[6];
		Random random = new Random(); // �̷��� void ������ ����, ����ð��� ���ڰ����� �ؼ� ���ڰ��� �ѷ��ش�. �̰��� ���� ����Ѵ�.
		System.out.println("���� ��ȣ: ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println("selectNumber value is " + selectNumber[i]);
			for (int j = 0; j < i; j++) { // �ߺ��� ���� ����
				if (selectNumber[i] == selectNumber[j]) {
					i--;
				}
			}
		}

		System.out.println("��÷��ȣ: ");

		if (OneTimePlug) {
//		int[] winNumber = new int[6];
			Random random02 = new Random();
			for (int j = 0; j < 6; j++) {
				winNumber[j] = random02.nextInt(45) + 1;
				for (int k = 0; k < j; k++) { // �ߺ��� ���� ����
					if (winNumber[j] == winNumber[k]) {
						j--;
					}
				}
				System.out.println("winNumber value is " + winNumber[j]);
			}
			OneTimePlug = false;
		} else {
			for (int j = 0; j < 6; j++) {
				System.out.println("winNumber value is " + winNumber[j]);
			}
		}

		// ��÷ ����
		// ���ϱ� ���� array�� sort�� �����Ѵ�.

		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);

		boolean result = Arrays.equals(selectNumber, winNumber);

		if (result == true) {
			System.out.println("1�� ��÷ OK");
			winOk = true;
		} else {
			System.out.println("���� ��ȸ��....��");
			winOk = false;
		}
		return winOk;
	}
}
