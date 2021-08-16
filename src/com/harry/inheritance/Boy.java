package com.harry.inheritance;

public class Boy extends People {
	public int idNum;

	public Boy(String name) {
		super(name); //부모를 가르킵니다.
		// TODO Auto-generated constructor stub
	}

	public Boy(String name, int idNum) {
		super(name);//부모를 생성자로 생성하고
		this.idNum = idNum;//자신의 필드변수에 값을 저장한다.
	}
}
