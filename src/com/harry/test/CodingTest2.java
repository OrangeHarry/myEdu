package com.harry.test;

import java.util.Arrays;

public class CodingTest2 {
	public static void main(String[] args) {
		int x = 4;
		int y = 3;

		long[] result = new long[y];
	    long z = x;
         
	      for(int i = 0; i < y; i++){
	          result[i] = z * (i+1);
	      }
	      
	      System.out.println(Arrays.toString(result));
	}
}
