package com.harry.inheritance;

public class SamsungPhone extends SmartPhone {

	public SamsungPhone(String name) {
		super(name);
	}

	public void quickPowerOn() {// �Ｚ�� �ű���Դϴ�.
		System.out.println("SamsungPhone quick Power Off");
	}

	public void bootingLogo() {
		System.out.println("Samsung Logo is visible...");
	}
}
