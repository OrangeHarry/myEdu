package com.harry.collect;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List list = new Vector();// 일반적인 사용

		list.add("철수");
		list.add("민수");
		list.add("헌민");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i);// get메소드를 통하여 인덱스로 불러오고 캐스팅하여 임시 저장합니다.
			System.out.println("Vector value is [" + temp + "]");// 임시 저장한 값을 출력합니다.
		}
		System.out.println("----------------------");

		List list2 = new Vector();
		list2.add(new Book("역사의 시작", "철수")); // book클래스를 생성해서 vector에 넣습니다.
		list2.add(new Book("수학의 시작", "영희"));
		list2.add(new Book("철학의 개요", "수지"));

		for (int i = 0; i < list2.size(); i++) {
			Book book = (Book) list2.get(i);// get메소드를 통하여 인덱스로 불러오고 캐스팅하여 임시저장합니다.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}
	}
}
