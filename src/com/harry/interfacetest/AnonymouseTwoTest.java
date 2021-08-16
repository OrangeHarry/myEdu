package com.harry.interfacetest;

public class AnonymouseTwoTest {
	public static void main(String[] args) {
		Remocon remocon = new Remocon() {

			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("劳疙按眉备泅 setOn");
			}

			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("劳疙按眉备泅 setOff");
			}
		};
		remocon.setOn();
		remocon.setOff();
	}
}
