package com.harry.collect;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new LinkedList(); // ť�� LinkedList�� �����ؼ� ����մϴ�.

		queue.offer(new Custom("Chulsu", "cs"));// ����
		queue.offer(new Custom("Sujin", "sj"));
		queue.offer(new Custom("Haejin", "hj"));

		while (!queue.isEmpty()) {// ť�� ������� Ȯ���ϰ� ��� ���� ������.
			Custom custom = (Custom) queue.poll();
//			Custom custom = (Custom) queue.peek(); //�� ó�� �� �� ���(������ ����..���ѷ���..)

			System.out.println("Custom name value is [" + custom.name + "]");
		}
	}
}
