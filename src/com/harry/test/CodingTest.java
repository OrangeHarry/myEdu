package com.harry.test;


public class CodingTest {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		long answer = 0;
		
		if(a<b){
            for(int i=a; i<b; i++){
                answer += i;
            }
        }else if(a>b){
            for(int i=b; i<a; i++){
                answer += i;
            }
        }else{
            answer = a;
        }
     
		System.out.println(answer);
	}
}
