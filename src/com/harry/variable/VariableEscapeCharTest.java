package com.harry.variable;

public class VariableEscapeCharTest {
	public static void main(String[] args) {
		System.out.println("Variable Escape Char Test");

		String tab = "\t";
		System.out.println("escapeChar Test tab ----" + tab + "------");

		String newLine = "\n";
		System.out.println("escapeChar Test newLine----" + newLine + "----");

		String backSlash = "\\";
		System.out.println("escapeChat Test backSlash----" + backSlash + "-----");
	}

}
