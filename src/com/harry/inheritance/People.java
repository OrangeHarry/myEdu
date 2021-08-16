package com.harry.inheritance;

public class People {
	public String name; // 얘는 그냥 매개변수, 받아오는거, 실제값이 아니야!!
	
	public People(String name) {//위에 name이랑 같은게 아니고 하나의 독립된 개체
		this.name = name;//얘가 실제값!!
		System.out.println("{parents] People Constructor OK");
	}
}
