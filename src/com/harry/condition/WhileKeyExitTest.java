package com.harry.condition;

import java.io.IOException;

public class WhileKeyExitTest {
	public static void main(String[] args) throws Exception {
		boolean isRun = true;
		int keyCode = 0;

		while (isRun) {// true��� ��� ����.
			keyCode = System.in.read();// Ű�� �Է¹޽��ϴ�.

			if (keyCode == 49) {// ���� 1�� Ű�ڵ��Դϴ�.
				isRun = false; // whileŻ��
			} else {
				System.out.println("keyCode value is " + keyCode);
			}
		}
		System.out.println("Program is End..");
	}
}
