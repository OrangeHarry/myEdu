package com.harry.javaapi;

public class SystemAPITest {
	public static void main(String[] args) {
		System.out.println("My OS is [" + System.getProperty("os.name") + "]");
		System.out.println("My Java version is [" + System.getProperty("java.version") + "]");

		for (int i = 0; i < 1000; i++) {// 천번
			System.out.println("counter is " + i);
			if (i == 799) {// 팔백번
				System.out.println("counter is [" + i + "]gc!");
			} else if (i == 899) {// 구백번
				System.out.println("counter is [" + i + "]Exit!");
				System.exit(0);
			} else {

			}
		}
	}
}
//System.getProperty("os.name"); 시스템 프로퍼티 읽기 OS
//System.getProperty("java.version"); 시스템 프로퍼티 읽기 Java Version 
//System.exit(0); 프로그램의 강제종료
//System.gc(): 시스템에서 메모리 확보.
