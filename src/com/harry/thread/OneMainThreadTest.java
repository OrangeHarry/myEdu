package com.harry.thread;

public class OneMainThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(500);// 0.5초 뒤에 다시 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
