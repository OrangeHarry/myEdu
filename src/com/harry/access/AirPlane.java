package com.harry.access;

public class AirPlane {
	private boolean isStop; //�ʵ�
	private int flySpeed;
	
	public boolean isStop() {//getter ���� �������� ������ ������ Ÿ���� ��
		return isStop;
	}
	public void setStop(boolean isStop) {//setter ���̵�
		this.isStop = isStop;
	}
	public int getFlySpeed() {//getter
		return flySpeed;
	}
	public void setFlySpeed(int flySpeed) {//setter
		this.flySpeed = flySpeed;
	}
	
	

}
