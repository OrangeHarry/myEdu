package com.harry.thread;

public class ExtendsThreadTest {
	public static void main(String[] args) {
		Thread thread = new FirstTaskEx();
		thread.start();

		Thread thread2 = new ThirdTaskEx();
		thread2.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
