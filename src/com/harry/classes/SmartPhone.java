package com.harry.classes;

public class SmartPhone {
	String phoneName = "none";

	// public SmartPhone() {
//		
//	}

	// public SmartPhone() {
//		super();
//		// TODO Auto-generated constructor stub
//		phoneName = "myPhone";
//		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);
//	}
//	public SmartPhone(String name) {//매개변수로 String을 가져옴 String옆에는 목적에 맞게 내가 알아서 네이밍 하면된다
//		phoneName = name;//이 String형을 필드에 넣는다.
//		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);
//
//	}

	public SmartPhone(String phoneName) {// 이름이 phoneName으로 같지만, 필드명이 아니라 받아오는값이야!!
		super(); // 상위 class 지칭
		this.phoneName = phoneName; // 받아온 값과 필드의 값을 구별하기 위하여 this를 넣는것(자동완성 짱짱!!)
		System.out.println("SmartPhone Constructor is call phoneName value is " + phoneName);// 얘는 직접입력

	}

}
