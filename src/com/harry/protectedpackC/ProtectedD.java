package com.harry.protectedpackC;

import com.harry.protectedpackA.ProtectedA;//다른패키지의 import

public class ProtectedD extends ProtectedA {
	public String name;

	public void protectedMethod() {
		super.name = "ProD";// 상속을 받았으므로 다른 패키지라도 super로 접근가능
		super.protectedMethod();// 상속을 받았으므로 다른패키지라도 super로 접근가능
	}
}
