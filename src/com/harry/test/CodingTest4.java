package com.harry.test;

public class CodingTest4 {
	public static void main(String[] args) {
		String result = "";
        String phone_number = "01072547761";          
        
        int a = phone_number.length()-4;
        
        for(int i=0; i<a; i++) {
        	result += "*";
        }
        
        String tempNum = phone_number.substring(phone_number.length()-4,phone_number.length());
        System.out.println(result+tempNum);
	}
}

//return phone_number.replaceAll(".(?=.{4})", "*"); 정규식 코드...