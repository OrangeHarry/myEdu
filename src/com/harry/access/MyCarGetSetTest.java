package com.harry.access;

public class MyCarGetSetTest {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.setSpeed(20);// setter �޼ҵ�� �����Ͽ� �� ����

		System.out.println("myCar speed value is [" + myCar.getSpeed() + "]");
	}//getter �޼ҵ带 �̿��Ͽ� ���� ������
}
