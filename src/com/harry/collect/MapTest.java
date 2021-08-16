package com.harry.collect;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("jane", 100); // Ű ���� ������ ����
		map.put("suji", 90);
		map.put("minsu", 80);

		System.out.println("map size is [" + map.size() + "]");
		System.out.println("map.get(key) value is [" + map.get("suji") + "]");// Ű ������ �����
		System.out.println("--------------------------");

		// HashMap�� ��ü ���� �������� ��� ����////////
		Set set = map.keySet();// set : ��������� �������� �ʴ� �÷���(����). ���⿡ HashMap�� Ű�� ������ �ִ´�.
		Iterator iterator = set.iterator();// �ݺ��ڿ� set�ݺ��ڸ� �ִ´�.
		while (iterator.hasNext()) {// �ݺ��ڰ� ������ ������ ����(�ڵ����� hasNext�� ���� ���ϰ� true,false)
			String key = (String) iterator.next();// �ݺ��ڸ� ���ؼ� Ű�� �ϳ��� ��� �� Ű ������ value�� ��´�.
			Integer value = (Integer) map.get(key);// Ű�� �־� ���� integer������ ĳ�����Ѵ�.
			System.out.println("Key value is [" + key + "]" + "real value is [" + value + "]");
		}
		System.out.println("---------------------------");

		map.remove("jane");// jane�̶�� Ű�� ����.
		System.out.println("02 map size is[" + map.size() + "]");// ���� �� ���� ���.
	}
}
