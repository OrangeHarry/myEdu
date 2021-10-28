package com.harry.test;

public class CodingTest3XX {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		 
		int[][] arr1 = new int[2][3]; 
		int[][] arr2 = new int[1][2];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			for(int j=0; j<arr1.length; j++) {
				System.out.println(arr1[j]);
			}
		}
	}
}
