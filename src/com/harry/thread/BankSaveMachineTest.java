package com.harry.thread;

public class BankSaveMachineTest {
	public static void main(String[] args) {
		BankSaveMachine bankSaveMachine = new BankSaveMachine();

		Custom01 custom01 = new Custom01();
		custom01.setBankSaveMachine(bankSaveMachine);// ������ü ����
		custom01.start();// ������ ����

		Custom02 custom02 = new Custom02();
		custom02.setBankSaveMachine(bankSaveMachine);// ������ü ����
		custom02.start();// ������ ����
	}
}
