package com.harry.classes;

public class Radio {
	String color = ""; // �ʵ�
	static String name = "SONY ICF-P26"; // ���� �ʵ�

	void onRadio() {// �޼ҵ�
		System.out.println("Radio is turn on");
	}

	static void onQuickRadio() { // ���� (static)�޼ҵ�
		System.out.println("Radio is turn onQuick");
	}
}
