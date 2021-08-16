package com.harry.refertype;

public class ArrayCopyTest {
	public static void main(String[] args) {
		String asisMember[] = { "paul", "json", "alice" };
		String toBeMember[] = new String[6];

		for (int i = 0; i < asisMember.length; i++) {
			toBeMember[i] = asisMember[i];
		}
		toBeMember[4] = "Çå¹Î";
		for (int j = 0; j < toBeMember.length; j++) {
			System.out.println("toBeMember[" + j+ "] " + toBeMember[j]);
		}
	}
}
