package com.harry.inheritance;

public class LGPhone extends SmartPhone {

	public LGPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void quickPowerOff() {// LG���� �ű��
		System.out.println("LGPhone quick Power Off");
	}

	@Override // ������(Override)�Դϴ�.
	public void bootingLogo() {
		// TODO Auto-generated method stub
		System.out.println("LG Logo is visible...");
	}
}
