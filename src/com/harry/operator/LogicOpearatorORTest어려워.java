package com.harry.operator;

public class LogicOpearatorORTest����� {
	public static void main(String[] args) {
		boolean isOnPc = true;
		boolean isOnPhone = false;

		if (isOnPc || isOnPhone) { // ���� �ǿ����ڸ� �˻��Ͽ� true�� ����
			// �����ڸ� �˻����� �ʽ��ϴ�.ȿ�����̹Ƿ� �ǹ����� �̰��� ���� ���Դϴ�.
			System.out.println("OR(||) is true..isOnPc isOnPhone");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);

		} else {
			System.out.println("OR(||) the other case...");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);

			System.out.println("=======================");

			if (isOnPc | isOnPhone) {// �ǿ����� 2���� ��� �˻��� ��ȿ�������� �ǹ�X
				System.out.println("OR(|) is true..isOnPc isOnPhone");
				System.out.println("isOnPc value is " + isOnPc);
				System.out.println("isOnPhone value is " + isOnPhone);
			} else {
				System.out.println("OR(|) the other case...");
				System.out.println("isOnPc value is " + isOnPc);
				System.out.println("isOnPhone value is " + isOnPhone);
			}
		}
	}
}
