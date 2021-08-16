package com.harry.classes;

public class RefrigeratorMethodTest {
	public static void main(String[]args) {
		Refrigerator refrigerator = new Refrigerator();
		
		refrigerator.goOnOpen();
		refrigerator.goOnClose();
		System.out.println("Is refrigerator door open??["+refrigerator.isDoorOpen()+"]");
		refrigerator.runFreeze();
		System.out.println("refrigerator Modelname is "+refrigerator.getModelName());
		System.out.println("refrigerator minimun temperature is "+refrigerator.getTemperature());
	}

}
