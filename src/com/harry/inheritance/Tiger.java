package com.harry.inheritance;

public class Tiger extends Animal {
	String name = "��ȣ";

	void attack() {
		System.out.println("[Child] Tiger is attack");
	}

	void slowWalk() {
		System.out.println("------Tiger Slow walk start-------");
		walk();//�θ��� �޼��带 ����� �� �ֽ��ϴ�.
		System.out.println("------Tiger Slow walk end---------");
	}
}
