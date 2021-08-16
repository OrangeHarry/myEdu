package com.harry.protectedpackA;//패키지명 확인

public class ProtectedA {
	protected String name;

	protected void protectedMethod() {
		System.out.println("protectedA protectedMethod");
	}
}
//Protected는 다른 package에서 접근을 못하도록 막습니다. 
//그러나 다른 package라도 상속관계에 있다면, 접근 가능합니다.