package com.harry.protectedpackC;

import com.harry.protectedpackA.ProtectedA;//�ٸ���Ű���� import

public class ProtectedD extends ProtectedA {
	public String name;

	public void protectedMethod() {
		super.name = "ProD";// ����� �޾����Ƿ� �ٸ� ��Ű���� super�� ���ٰ���
		super.protectedMethod();// ����� �޾����Ƿ� �ٸ���Ű���� super�� ���ٰ���
	}
}
