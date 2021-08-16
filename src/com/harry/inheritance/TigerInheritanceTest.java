package com.harry.inheritance;

public class TigerInheritanceTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.color = "White"; // �θ�� �����Ͽ��� ������
		tiger.walk();
		tiger.eat();
		tiger.attack();
		System.out.println("Tiger color is [" + tiger.color + "]");
		tiger.slowWalk();

		Mouse mouse = new Mouse();
		mouse.color = "black";
		mouse.walk();
		mouse.eat();
		System.out.println("Mouse color is [" + mouse.color + "]");
		System.out.println("Mouse name is [" + mouse.name + "]");
		mouse.runAway();
	}
}
