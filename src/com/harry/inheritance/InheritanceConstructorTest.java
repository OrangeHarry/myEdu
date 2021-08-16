package com.harry.inheritance;

public class InheritanceConstructorTest {
	public static void main(String[] args) {
		Boy boy = new Boy("Bob");

		System.out.println("===============");
		Boy boyTwo = new Boy("Çå¹Î", 29);
		System.out.println("boyTwo name value is [" + boyTwo.name + "]");
		System.out.println("boyTwo idNum value is [" + boyTwo.idNum + "]");
	}
}
