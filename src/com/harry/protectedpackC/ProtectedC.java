package com.harry.protectedpackC; //��Ű���� Ȯ��

import com.harry.protectedpackA.ProtectedA;//�ٸ���Ű���� import

public class ProtectedC {
	public String name;

	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
//		protectedA.name = "Pro";//���ٺҰ�
//		protectedA.protectedMethod();//���ٺҰ�
	}
}
