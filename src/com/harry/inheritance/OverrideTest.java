package com.harry.inheritance;

public class OverrideTest {
	public static void main(String[] args) {
		Apart apart = new Apart();
		apart.musicPlay();
		apart.rest();// 자식 클래스에서 재정의된 메소드를 호출

		System.out.println("-----------");

		CountryHouse countryHouse = new CountryHouse();
		countryHouse.playBaseball();
		countryHouse.rest();
		countryHouse.sleep();// 자동완성으로 재정의한 메소드의 호출
	}
}
