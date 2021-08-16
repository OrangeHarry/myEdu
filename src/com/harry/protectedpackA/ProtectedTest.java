package com.harry.protectedpackA;

import com.harry.protectedpackC.ProtectedD;

public class ProtectedTest {
	public static void main(String[] args) {
		ProtectedB protectedB = new ProtectedB();
		protectedB.protectedMethod();

		ProtectedD protectedD = new ProtectedD();
		protectedD.protectedMethod();
	}
}
