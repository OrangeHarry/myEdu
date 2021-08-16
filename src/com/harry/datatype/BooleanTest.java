package com.harry.datatype;

public class BooleanTest {
	public static void main(String[] args) {
		boolean isStudent = false;

		if (isStudent) {
			System.out.println("학생입니다.");
		} else {
			System.out.println("학생이아닙니다.");
		}
	}
}
//byte : 1byte, 8bit -> 기본 최소 저장 단위
//char : 2byte, 16bit -> 유니코드, 한글 완성형 (문자)
//int : 4byte, 32bit -> 가장 많이 사용 (정수)
//long : 8byte, 64bit -> 정수값 벗어나면, 어미에 대소문자 'L' (큰 정수)
//float : 4byte, 32bit -> 더블형과 구분위하여 어미에 대소문자 'F' (실수)
//double : 8byte, 64bit -> 아주 큰 실수
//boolean: 1byte, 8bit -> 논리연산자, (참, 거짓)

//byte(1) < short(2) < int(4) <long(8) < float(4) < double(8)