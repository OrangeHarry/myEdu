package com.harry.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		Remocon remocon;
		remocon = new Radio();
		// �������̽��� �����ϰ�, ����� �������̽��� ��ü�� �����ؼ� �ִ´�.
		// Remocon remocon = new Radio(); �̷��� �ۼ��ص�OK

		remocon.setOn();//�����ǵ� �޼ҵ��� ȣ��
		remocon.setInfoMenu();//�����ǵ� �޼ҵ��� ȣ��
		System.out.println("remocon.PRODUCT_ID value is [" + remocon.PROCUCT_ID + "]");//�ʵ�Ȯ��
	
		Remocon.alertError();//static method�� ȣ��
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
