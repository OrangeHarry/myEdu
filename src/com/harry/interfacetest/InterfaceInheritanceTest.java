package com.harry.interfacetest;

public class InterfaceInheritanceTest {
	public static void main(String[] args) {
		InputDeviceImplements inputDeviceImplements = new InputDeviceImplements(); // 상세구현된 클래스를 생성

		PhysicalButton physicalButton = inputDeviceImplements;// 인터페이스에 상세구현된 instance를 넣습니다.
		physicalButton.keyPressed(); // 자신의 class에 정의된 추상메소드만 호출가능

		ScreenTouch screenTouch = inputDeviceImplements; // 인터페이스에 상세구현된 instance를 넣습니다.
		screenTouch.onTouch();// 자신의 class에 정의된 추상 메소드만 호출가능

		EarPhoneSocket earPhoneSocket = inputDeviceImplements;
		earPhoneSocket.onSound();

		System.out.println("-------------------------------------");

		InputDevice inputDevice = inputDeviceImplements; // 다중상속한 InputDevice에 상세 구현된 클래스를 넣는다.
		/////// 아래 상속받은 두개의 메소드와 자신의 추상 메소드 모두 호출 가능////

		inputDevice.keyPressed();
		inputDevice.onTouch();
		inputDevice.alertError();
		inputDevice.onSound();
	}
}
