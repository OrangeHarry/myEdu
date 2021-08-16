package com.harry.collect;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(new PokerChip(1)); // 칩을 차곡차곡 넣습니다.
		stack.push(new PokerChip(5));
		stack.push(new PokerChip(10));

		while (!stack.isEmpty()) {// 비어있는지 확인 루프
			PokerChip pokerChip = (PokerChip) stack.pop();
//			PokerChip pokerChip = (PokerChip) stack.peek();//맨 위에 것을 가져오고 스택에서 제거하지 않음.(무한루프...)
			System.out.println("PoP PokerChip is [" + pokerChip.getValue() + "]");
		}
	}
}
