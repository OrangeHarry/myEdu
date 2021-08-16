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
		// TODO Auto-generated method stub 이 부분에 추가하면 됨
		System.out.println("CountryHouse is Sweet");// 처리내용추가
		super.sleep();// 부모 method의 호출도 가능
	}
}
