package com.harry.inheritance;

public class Boy extends People {
	public int idNum;

	public Boy(String name) {
		super(name); //�θ� ����ŵ�ϴ�.
		// TODO Auto-generated constructor stub
	}

	public Boy(String name, int idNum) {
		super(name);//�θ� �����ڷ� �����ϰ�
		this.idNum = idNum;//�ڽ��� �ʵ庯���� ���� �����Ѵ�.
	}
}
