package com.harry.interfacetest;

public class InterfaceInheritanceTest {
	public static void main(String[] args) {
		InputDeviceImplements inputDeviceImplements = new InputDeviceImplements(); // �󼼱����� Ŭ������ ����

		PhysicalButton physicalButton = inputDeviceImplements;// �������̽��� �󼼱����� instance�� �ֽ��ϴ�.
		physicalButton.keyPressed(); // �ڽ��� class�� ���ǵ� �߻�޼ҵ常 ȣ�Ⱑ��

		ScreenTouch screenTouch = inputDeviceImplements; // �������̽��� �󼼱����� instance�� �ֽ��ϴ�.
		screenTouch.onTouch();// �ڽ��� class�� ���ǵ� �߻� �޼ҵ常 ȣ�Ⱑ��

		EarPhoneSocket earPhoneSocket = inputDeviceImplements;
		earPhoneSocket.onSound();

		System.out.println("-------------------------------------");

		InputDevice inputDevice = inputDeviceImplements; // ���߻���� InputDevice�� �� ������ Ŭ������ �ִ´�.
		/////// �Ʒ� ��ӹ��� �ΰ��� �޼ҵ�� �ڽ��� �߻� �޼ҵ� ��� ȣ�� ����////

		inputDevice.keyPressed();
		inputDevice.onTouch();
		inputDevice.alertError();
		inputDevice.onSound();
	}
}
