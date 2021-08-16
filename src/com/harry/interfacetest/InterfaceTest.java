package com.harry.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		Remocon remocon;
		remocon = new Radio();
		// 인터페이스를 선언하고, 선언된 인터페이스에 객체를 생성해서 넣는다.
		// Remocon remocon = new Radio(); 이렇게 작성해도OK

		remocon.setOn();//재정의된 메소드의 호출
		remocon.setInfoMenu();//재정의된 메소드의 호출
		System.out.println("remocon.PRODUCT_ID value is [" + remocon.PROCUCT_ID + "]");//필드확인
	
		Remocon.alertError();//static method의 호출
		remocon.setOff();

		System.out.println("-------------------------");
		Remocon remocon2 = new TV();
		remocon2.setOn();
		remocon2.setInfoMenu();
		System.out.println("remocon2.UID value is [" + remocon2.UID + "]");
		Remocon.alertError();
		remocon2.setOff();
	}
}
