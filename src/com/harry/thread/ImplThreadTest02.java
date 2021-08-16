package com.harry.thread;

public class ImplThreadTest02 {
	public static void main(String[] args) {
		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
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
