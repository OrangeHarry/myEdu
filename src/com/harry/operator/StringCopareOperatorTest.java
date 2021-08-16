package com.harry.operator;

public class StringCopareOperatorTest {
	public static void main(String[] args) {
		String name01 = "窍清刮";
		String name02 = "窍清刮";
		String name03 = new String("窍清刮"); // 促弗 林家 锅瘤荐 曼炼, 胆府霸捞记 等 按眉(盒府等 按眉)

		System.out.println(name01 == name02);
		System.out.println(name01 == name03);
		System.out.println(name02 == name03);

		System.out.println("-----------------");

		System.out.println(name01.equals(name02));
		System.out.println(name01.equals(name03));
		System.out.println(name02.equals(name03));
	}
}
