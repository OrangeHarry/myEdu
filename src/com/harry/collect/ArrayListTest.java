package com.harry.collect;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();// �� �������� �����մϴ�.

		list.add("Korea");
		list.add("Japan");
		list.add("China");
		list.add(0, "America"); // index 0 ���� ����ֽ��ϴ�. ������ �ö󰩴ϴ�.

		System.out.println("ArrayList size of" + list.size());
		System.out.println("index 1 value is " + list.get(1)); // �ε��� 1�� �ִ� ���� ����մϴ�.

		System.out.println("-----------------------");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i);// get�޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ�����Ͽ� �ӽ������մϴ�.
			System.out.println("ArrayList value is [" + temp + "]");
		}
		list.clear();// ����Ʈ�� ��� ����ϴ�.
		System.out.println("02 ArrayList size of " + list.size());
	}
}
