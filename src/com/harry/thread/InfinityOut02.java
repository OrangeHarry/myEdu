package com.harry.thread;

public class InfinityOut02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while (true) {// ���ѹݺ��˴ϴ�.
				System.out.println("-----Infinity 02 String out!------");
				Thread.sleep(1);// �� interrupt�� ���ٸ� sleep�� �ؾ���.
			}
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();//interrupt�� exception�� �߻� �Ǿ����� Ȯ���� ���ϴ�.
			System.out.println("------interruptedException-------");
		}
		System.out.println("--------02.....end---------");
	}
}
