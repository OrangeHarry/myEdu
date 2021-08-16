package com.harry.interfacetest;

public interface Remocon {
	// 상수
	public int UID = 100;
	public int PROCUCT_ID = 1;

	// abstract method(추상)
	void setOn();// abstract생략됨
	abstract void setOff();// abstract 생략하지않음(그냥 생략하지 말고 쓰자!!)

	// default method(기본)
	default void setInfoMenu() {
		System.out.println("Show Info Menu");
	}

	// static method(정적)
	static void alertError() {
		System.out.println("Error CODE:0001");
	}
}
