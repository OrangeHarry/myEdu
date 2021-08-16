package com.harry.javaapi;

import java.util.StringTokenizer;

public class StringTokenTestTwo {
	public static void main(String[] args) {
		String[] stringsArray = new String[4];
		String string = "suji|minsu|sumi|haksun";

		StringTokenizer stringTokenizer = new StringTokenizer(string, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
			stringsArray[i] = result; // 배열에 파생된 값을 넣는다.
		}
		for (int j = 0; j < stringsArray.length; j++) {
			System.out.println("-----Arrays value is [" + stringsArray[j] + "]");
		}
	}
}
