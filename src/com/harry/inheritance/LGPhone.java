package com.harry.inheritance;

public class LGPhone extends SmartPhone {

	public LGPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void quickPowerOff() {// LG폰의 신기능
		System.out.println("LGPhone quick Power Off");
	}

	@Override // 재정의(Override)입니다.
	public void bootingLogo() {
		// TODO Auto-generated method stub
		System.out.println("LG Logo is visible...");
	}
}
