package com.harry.thread;

public class InfinityNumOutTest {
	public static void main(String[] args) {
		InfinityNumOut infinityNumOut = new InfinityNumOut();
		infinityNumOut.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (infinityNumOut.getCounter() > 99) {
			infinityNumOut.setStop(true);
		}
	}
}