package com.harry.collect;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List list = new Vector();// �Ϲ����� ���

		list.add("ö��");
		list.add("�μ�");
		list.add("���");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i);// get�޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ�����Ͽ� �ӽ� �����մϴ�.
			System.out.println("Vector value is [" + temp + "]");// �ӽ� ������ ���� ����մϴ�.
		}
		System.out.println("----------------------");

		List list2 = new Vector();
		list2.add(new Book("������ ����", "ö��")); // bookŬ������ �����ؼ� vector�� �ֽ��ϴ�.
		list2.add(new Book("������ ����", "����"));
		list2.add(new Book("ö���� ����", "����"));

		for (int i = 0; i < list2.size(); i++) {
			Book book = (Book) list2.get(i);// get�޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ�����Ͽ� �ӽ������մϴ�.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}
	}
}
