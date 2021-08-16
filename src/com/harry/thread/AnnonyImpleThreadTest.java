package com.harry.thread;

public class AnnonyImpleThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Annoy First Task");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		thread.start(); // 정말 너무 중요한거*** 이게 있어야 시작을해 쓰레드는

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Annoy Third Task");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}

			}
		});
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
