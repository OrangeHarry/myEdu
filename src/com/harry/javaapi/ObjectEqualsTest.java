package com.harry.javaapi;

public class ObjectEqualsTest {
	public static void main(String[] args) {
		Customer customer = new Customer("Çå¹Î");
		Customer customer2 = new Customer("¹ÎÇå");

		if (customer.equals(customer2)) {
			System.out.println("object equals true");
		} else {
			System.out.println("object equals false");
		}
		if (customer.name.equals(customer2)) {
			System.out.println("name value equals true");
		} else {
			System.out.println("name vlaue equals false");
		}
	}
}
