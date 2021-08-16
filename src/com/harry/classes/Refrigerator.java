package com.harry.classes;

public class Refrigerator {
	void goOnOpen() {
		System.out.println("Refrigerator is go on open");
	}

	void goOnClose() {
		System.out.println("Refrigerator is go on close");
	}

	boolean isDoorOpen() {
		return true;
	}

	void runFreeze() {
		System.out.println("Refrigerator runs Freeze");
	}

	String getModelName() {
		String result = "ABC-7761";

		return result;
	}

	int getTemperature() {
		int result = 0;
		result = -20;

		return result;
	}
}
