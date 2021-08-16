package com.harry.protectedpackC; //패키지명 확인

import com.harry.protectedpackA.ProtectedA;//다른패키지의 import

public class ProtectedC {
	public String name;

	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
//		protectedA.name = "Pro";//접근불가
//		protectedA.protectedMethod();//접근불가
	}
}
