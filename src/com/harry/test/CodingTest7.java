package com.harry.test;

public class CodingTest7 {

	    public String solution(String phone_number) {
	               
	        String answer = "";
	        
	        int a = phone_number.length()-4;
	        
	        for(int i=0; i<a; i++){
	            answer += "*";
	        }
	        
	         answer += phone_number.substring(phone_number.length() - 4);
	    
	        return answer;
	    }
	}


