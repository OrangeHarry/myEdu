package com.harry.operator;

public class DenyOperatorTest {
	public static void main(String[] args) {
		boolean isOnTV = false;
		System.out.println("isOnTV value is " + isOnTV);

		isOnTV = !isOnTV;

		System.out.println("isOnTV value is " + isOnTV);
		
		if(!isOnTV) {
			System.out.println("TV is off");
		}else{
			System.out.println("TV is on");
		}
	}
}
