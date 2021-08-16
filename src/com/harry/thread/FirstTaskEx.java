package com.harry.thread;

public class FirstTaskEx extends Thread {

	@Override
	public void run() {// 재정의 합니다.
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("First Task EX");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
