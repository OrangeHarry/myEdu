package com.harry.collect;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();// 이 형식으로 생성합니다.

		list.add("Korea");
		list.add("Japan");
		list.add("China");
		list.add(0, "America"); // index 0 에다 집어넣습니다. 맨위로 올라갑니다.

		System.out.println("ArrayList size of" + list.size());
		System.out.println("index 1 value is " + list.get(1)); // 인덱스 1에 있는 값을 출력합니다.

		System.out.println("-----------------------");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i);// get메소드를 통하여 인덱스로 불러오고 캐스팅하여 임시저장합니다.
			System.out.println("ArrayList value is [" + temp + "]");
		}
		list.clear();// 리스트를 모두 지웁니다.
		System.out.println("02 ArrayList size of " + list.size());
	}
}
