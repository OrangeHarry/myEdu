package com.harry.inheritance;

public class Tiger extends Animal {
	String name = "백호";

	void attack() {
		System.out.println("[Child] Tiger is attack");
	}

	void slowWalk() {
		System.out.println("------Tiger Slow walk start-------");
		walk();//부모의 메서드를 사용할 수 있습니다.
		System.out.println("------Tiger Slow walk end---------");
	}
}
