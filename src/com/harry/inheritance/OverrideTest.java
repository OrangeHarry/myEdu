package com.harry.inheritance;

public class OverrideTest {
	public static void main(String[] args) {
		Apart apart = new Apart();
		apart.musicPlay();
		apart.rest();// �ڽ� Ŭ�������� �����ǵ� �޼ҵ带 ȣ��

		System.out.println("-----------");

		CountryHouse countryHouse = new CountryHouse();
		countryHouse.playBaseball();
		countryHouse.rest();
		countryHouse.sleep();// �ڵ��ϼ����� �������� �޼ҵ��� ȣ��
	}
}
