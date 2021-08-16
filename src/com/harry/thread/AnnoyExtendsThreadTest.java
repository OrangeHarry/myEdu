package com.harry.thread;

public class AnnoyExtendsThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				for (int i = 0; i < 10; i++) {
					System.out.println("Annoy First Task Ex");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();

		Thread thread2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				for (int i = 0; i < 10; i++) {
					System.out.println("Annoy Third Task Ex");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}

		};
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
