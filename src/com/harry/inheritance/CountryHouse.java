package com.harry.inheritance;

public class CountryHouse extends House {
	private String name;

	void playBaseball() {
		System.out.println("CountryHouse can play baseball");
	}

	void rest() {
		System.out.println("CountryHouse can forest bathing");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub �� �κп� �߰��ϸ� ��
		System.out.println("CountryHouse is Sweet");// ó�������߰�
		super.sleep();// �θ� method�� ȣ�⵵ ����
	}
}
