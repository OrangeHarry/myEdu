package com.harry.thread;

public class BankSaveMachine {
	private int money;

	public int getMoney() {
		return money;
	}

//	public void setMoney(int money) {
//		this.money = money;

//	public void setMoney(int money) {
//		this.money = money;
//
//		try {
//			Thread.sleep(3000);// ������ �ٺ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�.
//			// ����մϴ�.(�� ��� �ð��߿� �ٸ� �������� �ͼ� �� �ݾ��� �����մϴ�.)
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

//	public synchronized void setMoney(int money) {
//		this.money = money;
//		try {
//			Thread.sleep(3000);// ������ �ٺ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�.
//			// ����մϴ�.(�� ��� �ð��߿� �ٸ� �������� �ͼ� �� �ݾ��� �����մϴ�.)
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	public void setMoney(int money) {
		synchronized (this) {
			this.money = money;
			try {
				Thread.sleep(3000); // ������ �ٻ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�.
				// ����մϴ�. (�� ��� �ð��߿� �ٸ� �������� �ͼ� �ѱݾ��� �����մϴ�.)
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("BankSaneMachine money value is [" + this.money + "]");
		}
	}
}