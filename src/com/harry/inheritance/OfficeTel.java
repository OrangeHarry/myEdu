package com.harry.inheritance;

public class OfficeTel extends House {
	public String name;

	void work() {
		System.out.println("working");
	}

	void eat() {
		super.rest();
		System.out.println("eating");//부모 method를 호출합니다.
	}
}
