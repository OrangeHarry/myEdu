package com.harry.interfacetest;

public interface Remocon {
	// ���
	public int UID = 100;
	public int PROCUCT_ID = 1;

	// abstract method(�߻�)
	void setOn();// abstract������
	abstract void setOff();// abstract ������������(�׳� �������� ���� ����!!)

	// default method(�⺻)
	default void setInfoMenu() {
		System.out.println("Show Info Menu");
	}

	// static method(����)
	static void alertError() {
		System.out.println("Error CODE:0001");
	}
}
