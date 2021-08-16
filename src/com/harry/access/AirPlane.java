package com.harry.access;

public class AirPlane {
	private boolean isStop; //필드
	private int flySpeed;
	
	public boolean isStop() {//getter 값을 가져오기 때문에 동일한 타입을 씀
		return isStop;
	}
	public void setStop(boolean isStop) {//setter 보이드
		this.isStop = isStop;
	}
	public int getFlySpeed() {//getter
		return flySpeed;
	}
	public void setFlySpeed(int flySpeed) {//setter
		this.flySpeed = flySpeed;
	}
	
	

}
