package com.harry.inheritance;

public class AbstractTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone("myPhone");

		LGPhone lgPhone = new LGPhone("엘지");
		lgPhone.PowerOn();// abstract method호출
		lgPhone.quickPowerOff();
		lgPhone.PoewrOff();// abstract method 호출
		lgPhone.bootingLogo();

		System.out.println("------------------------");
		SamsungPhone samsungPhone = new SamsungPhone("S21");
		samsungPhone.PowerOn();
		samsungPhone.quickPowerOn();
		samsungPhone.PoewrOff();
		samsungPhone.bootingLogo();
	}
}

//abstract class 상속을 받아서만 사용 가능 합니다.