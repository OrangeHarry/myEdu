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
		infinityOut.setStop(true);// 2초 뒤에 쓰레드 실행Flag 값을 변경해줍니다.
	}
}
