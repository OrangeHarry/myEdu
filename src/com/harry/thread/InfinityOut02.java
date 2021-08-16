package com.harry.thread;

public class InfinityOut02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while (true) {// 무한반복됩니다.
				System.out.println("-----Infinity 02 String out!------");
				Thread.sleep(1);// 꼭 interrupt를 쓴다면 sleep을 해야함.
			}
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();//interrupt로 exception이 발생 되었는지 확인해 봅니다.
			System.out.println("------interruptedException-------");
		}
		System.out.println("--------02.....end---------");
	}
}
