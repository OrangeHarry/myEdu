package com.harry.thread;

public class InfinityNumOut02Test {
	public static void main(String[] args) {
		InfinityNumOut02 infinityNumOut02 = new InfinityNumOut02();
		infinityNumOut02.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (infinityNumOut02.getCounter() > 99) {
			infinityNumOut02.interrupt();
		}
	}
}
