package com.harry.javaapi;

public class SystemAPITest02 {
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;

		System.out.println("My OS is [" + System.getProperty("os.name") + "]");
		System.out.println("My Java version is [" + System.getProperty("java.version") + "]");

		for (int i = 0; i < 9999999; i++) {// 천만번
			System.out.println("counter is " + i);
			if (i == 0) {
				startTime = System.currentTimeMillis();
			} else if (i == 799) {// /팔백번
				System.out.println("counter is [" + i + "]gc!");
				System.gc();
			} else if (i == 899999) {// 구백만번이 아니라 구십만번인데...ㅎ.ㅎ
				endTime = System.currentTimeMillis();
				System.out.println("소요시간은 " + (endTime - startTime) / 1000 + "초");
				// 밀리세크 단위입니다. 초를구하려면 1000으로 나누어줘야합니다.
				System.out.println("counter is [" + i + "]Exit!");
				System.exit(0);
			} else {

			}
		}
	}
}
