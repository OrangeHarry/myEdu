package com.harry.inheritance;

public abstract class SmartPhone {
	public String name;

	public SmartPhone(String name) {
		super();
		this.name = name;
	}

	public void PowerOn() {
		System.out.println("SmartPhone Power On");
	}

	public void PoewrOff() {
		System.out.println("SmartPhone Power Off");
	}

	public abstract void bootingLogo();// 스마트폰 업그레이드!! 이 기능 무조건 넣어야한다.
}//추상 메소드는 껍데기만 선언 합니다. 
//당신들이 알아서 의무적으로 Logo 만들어라 이런 거죠.

//abstract를 붙히면 이 클래스는 new 연산자로 생성해서 사용 할 수 없습니다.
//무조건 상속으로 해!!
