package com.harry.inheritance;

public class SamsungPhone extends SmartPhone {

	public SamsungPhone(String name) {
		super(name);
	}

	public void quickPowerOn() {// 삼성의 신기능입니다.
		System.out.println("SamsungPhone quick Power Off");
	}

	public void bootingLogo() {
		System.out.println("Samsung Logo is visible...");
	}
}
