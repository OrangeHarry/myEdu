package com.harry.thread;

public class BankSaveMachineTest {
	public static void main(String[] args) {
		BankSaveMachine bankSaveMachine = new BankSaveMachine();

		Custom01 custom01 = new Custom01();
		custom01.setBankSaveMachine(bankSaveMachine);// 공유객체 설정
		custom01.start();// 쓰레드 시작

		Custom02 custom02 = new Custom02();
		custom02.setBankSaveMachine(bankSaveMachine);// 공유객체 설정
		custom02.start();// 쓰레드 시작
	}
}
