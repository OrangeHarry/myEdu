package com.harry.thread;

public class InfinityNumOut extends Thread {
	private boolean isStop = false;
	private int counter = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		while (!isStop) {
			this.counter++;
			System.out.println("Infinyty Counter value is " + this.counter);
		}
		System.out.println("-----end------");
	}

	public boolean isStop() {
		return isStop;
	}

	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
