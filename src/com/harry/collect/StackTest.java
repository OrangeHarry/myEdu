package com.harry.collect;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(new PokerChip(1)); // Ĩ�� �������� �ֽ��ϴ�.
		stack.push(new PokerChip(5));
		stack.push(new PokerChip(10));

		while (!stack.isEmpty()) {// ����ִ��� Ȯ�� ����
			PokerChip pokerChip = (PokerChip) stack.pop();
//			PokerChip pokerChip = (PokerChip) stack.peek();//�� ���� ���� �������� ���ÿ��� �������� ����.(���ѷ���...)
			System.out.println("PoP PokerChip is [" + pokerChip.getValue() + "]");
		}
	}
}
