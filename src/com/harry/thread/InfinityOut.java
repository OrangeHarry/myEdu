package com.harry.thread;

public class InfinityOut extends Thread {
	private boolean isStop = false;

	public boolean isStop() {
		return isStop;
	}

	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (!isStop) {
			System.out.println("--------Infinity String Out!--------");
		}
		System.out.println("------end-------");
	}
}
