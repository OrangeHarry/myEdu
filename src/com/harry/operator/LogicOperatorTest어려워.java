package com.harry.operator;

public class LogicOperatorTest����� {
	public static void main(String[] args) {
		boolean isOnTv = true;
		boolean isOnRadio = true;

		if (isOnTv && isOnRadio) {// ���� �ǿ����ڸ� �˻��Ͽ� false�� ���� �����ڸ�
									// �˻����� �ʽ��ϴ�. ȿ�����̹Ƿ� �ǹ����� ���� ����.
			System.out.println("AND(&&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		} else {
			System.out.println("And(&&) the other case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isOnRadio value is " + isOnRadio);
		}
		System.out.println("=================");

		if (isOnTv & isOnRadio) {// �ǿ�����2���� ��� �˻��մϴ�(��ȿ����,�ǹ����� �Ⱦ�.)
			System.out.println("AND(&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&) the others case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		}
	}
}
