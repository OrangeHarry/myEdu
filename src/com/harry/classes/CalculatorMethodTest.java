package com.harry.classes;

public class CalculatorMethodTest {
	public static void main(String[]args) {
		Calculator calculator = new Calculator();
		
		System.out.println("Calculator plus(1,2) value is "+calculator.plus(1, 2));
		System.out.println("Calculator minus(3,2) value is "+calculator.minus(4, 2));
		System.out.println("Calculator getName value is "+calculator.getName());
		System.out.println("Calculator BateryEmpty value is "+calculator.isBateryEmpty());
		calculator.setFactoryInit();
	}

}
