package com.harry.interfacetest;

public class AnonymouseTest {//익명 구현 객체
	public static void main(String[]args) {
		Remocon remocon = new Remocon() {//인터페이스의 변수 = new 인터페이스
			
			@Override
			public void setOn() {//인터페이스에 정의된 추상메소드 재정의
				// TODO Auto-generated method stub
				System.out.println("----setOn Anonymouse----");
			}
			
			@Override
			public void setOff() {//인터페이스에 정의된 추상 메소드 재정의
				// TODO Auto-generated method stub
				System.out.println("----setOff Anonymouse----");
			}
		}; //;로 끝남에 주의!!!(난 자동완성썻지롱~~)
		remocon.setOn();
		remocon.setOff();
	}
}

//인터페이스에 추상메소드는 꼭 있어야하나??