package com.harry.protectedpackA;//패키지명 확인

public class ProtectedB {
	public String name;

	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
		protectedA.name = "Pro"; //접근가능
		protectedA.protectedMethod(); //접근가능
	}
}
