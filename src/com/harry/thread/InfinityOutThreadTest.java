package com.harry.thread;

public class InfinityOutThreadTest {
	public static void main(String[] args) {
		InfinityOut infinityOut = new InfinityOut();
		infinityOut.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		infinityOut.setStop(true);// 2�� �ڿ� ������ ����Flag ���� �������ݴϴ�.
	}
}
