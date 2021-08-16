package com.harry.access;

public class AirPlaneGetSetTest {
	public static void main(String[] args) {
		AirPlane airPlane = new AirPlane();
		airPlane.setStop(true);
		airPlane.setFlySpeed(500);

		System.out.println("Airplane stop is [" + airPlane.isStop() + "]");
		System.out.println("Airplane FlySpeed value is [" + airPlane.getFlySpeed() + "]");
	}
}
