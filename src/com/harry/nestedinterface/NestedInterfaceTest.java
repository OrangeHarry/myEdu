package com.harry.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new MessageListener());// setter�� Ŭ���� ���� �������̽��� �󼼱��� ��ü�� ������ �ش�!!
		button.onTouch();// ���� ȣ���ϸ� �� ������ �κ��� ����ȴ�.

		System.out.println("===========================================");
		button.setOnClickListener(new PushListener());
		button.onTouch();
	}
}
//���ݱ��� �� �۾��� �����Ͽ� ������ �ϰڽ��ϴ�.
//Ŭ�������� �ִ� ��ø �������̽� ���� -> �޼ҵ� ���� -> �� ���� Ŭ���� �߰� �� ���� ->
//��ø �������̽��� ���� Ŭ������ ���� setter�� ���� -> ������ Ȯ��