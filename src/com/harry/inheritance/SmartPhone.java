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

	public abstract void bootingLogo();// ����Ʈ�� ���׷��̵�!! �� ��� ������ �־���Ѵ�.
}//�߻� �޼ҵ�� �����⸸ ���� �մϴ�. 
//��ŵ��� �˾Ƽ� �ǹ������� Logo ������ �̷� ����.

//abstract�� ������ �� Ŭ������ new �����ڷ� �����ؼ� ��� �� �� �����ϴ�.
//������ ������� ��!!
