package com.harry.thread;

public class Custom01 extends Thread {
	private BankSaveMachine bankSaveMachine;

	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		bankSaveMachine.setMoney(200);// �� �ݾ��� 200������ ����
	}
}
