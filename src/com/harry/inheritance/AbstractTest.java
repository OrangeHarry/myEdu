package com.harry.inheritance;

public class AbstractTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone("myPhone");

		LGPhone lgPhone = new LGPhone("����");
		lgPhone.PowerOn();// abstract methodȣ��
		lgPhone.quickPowerOff();
		lgPhone.PoewrOff();// abstract method ȣ��
		lgPhone.bootingLogo();

		System.out.println("------------------------");
		SamsungPhone samsungPhone = new SamsungPhone("S21");
		samsungPhone.PowerOn();
		samsungPhone.quickPowerOn();
		samsungPhone.PoewrOff();
		samsungPhone.bootingLogo();
	}
}

//abstract class ����� �޾Ƽ��� ��� ���� �մϴ�.