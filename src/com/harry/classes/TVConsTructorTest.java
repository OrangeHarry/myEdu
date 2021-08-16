package com.harry.classes;

public class TVConsTructorTest {
	public static void main(String[] args) {
		TV tv = new TV();

		TV tv2 = new TV("SAMSUNG");
		TV tv3 = new TV("LG", "2021.01.02");
		TV tv4 = new TV("DAEWOO", "2021.05.21", "¾ÆÀÌ¾ð¸ÇTV");
		TV tv5 = new TV("HACOMPANY", "1993.11.26", "ÇÏÇå¹Î", "Black");

		System.out.println("tv value is [" + tv.company + "]");
		System.out.println("tv value is [" + tv.madeDay + "]");
		System.out.println("tv value is [" + tv.name + "]");
		System.out.println("tv value is [" + tv.color + "]");
		System.out.println("----------------------------");
		System.out.println("tv2 value is [" + tv2.company + "]");
		System.out.println("tv2 value is [" + tv2.madeDay + "]");
		System.out.println("tv2 value is [" + tv2.name + "]");
		System.out.println("tv2 value is [" + tv2.color + "]");
		System.out.println("----------------------------");
		System.out.println("tv3 value is [" + tv3.company + "]");
		System.out.println("tv3 value is [" + tv3.madeDay + "]");
		System.out.println("tv3 value is [" + tv3.name + "]");
		System.out.println("tv3 value is [" + tv3.color + "]");
		System.out.println("----------------------------");
		System.out.println("tv4 value is [" + tv4.company + "]");
		System.out.println("tv4 value is [" + tv4.madeDay + "]");
		System.out.println("tv4 value is [" + tv4.name + "]");
		System.out.println("tv4 value is [" + tv4.color + "]");
		System.out.println("----------------------------");
		System.out.println("tv5 value is [" + tv5.company + "]");
		System.out.println("tv5 value is [" + tv5.madeDay + "]");
		System.out.println("tv5 value is [" + tv5.name + "]");
		System.out.println("tv5 value is [" + tv5.color + "]");
		System.out.println("----------------------------");
	}
}
