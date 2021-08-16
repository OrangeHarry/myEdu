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
//			Thread.sleep(3000);// 은행이 바빠서 3초간의 처리시간이 필요합니다.
//			// 대기합니다.(이 대기 시간중에 다른 누군가가 와서 총 금액을 변경합니다.)
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

//	public synchronized void setMoney(int money) {
//		this.money = money;
//		try {
//			Thread.sleep(3000);// 은행이 바빠서 3초간의 처리시간이 필요합니다.
//			// 대기합니다.(이 대기 시간중에 다른 누군가가 와서 총 금액을 변경합니다.)
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	public void setMoney(int money) {
		synchronized (this) {
			this.money = money;
			try {
				Thread.sleep(3000); // 은행이 바뻐서 3초간의 처리시간이 필요합니다.
				// 대기합니다. (이 대기 시간중에 다른 누군가가 와서 총금액을 변경합니다.)
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("BankSaneMachine money value is [" + this.money + "]");
		}
	}
}