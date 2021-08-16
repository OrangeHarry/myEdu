package com.harry.access;

public class MyCarGetSetTest {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.setSpeed(20);// setter 메소드로 접근하여 값 변경

		System.out.println("myCar speed value is [" + myCar.getSpeed() + "]");
	}//getter 메소드를 이용하여 값을 가져옴
}
