package com.harry.classes;

public class SmartPhoneConstructorTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone();
		SmartPhone smartPhone = new SmartPhone("yourSmartPhone");// 출력되는 값은 여기구나
		// (위에꺼)생성과 동시에 생성자에 값을 전달하여 phoneName이 변경합니다.
		System.out.println("smartPhone.phoneName value is [" + smartPhone.phoneName + "]");
	}
}
