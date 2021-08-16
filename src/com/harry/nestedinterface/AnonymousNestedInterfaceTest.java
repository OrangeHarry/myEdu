package com.harry.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn();// 필드접근
		anonymous.fieldRemoConEx.setOff();// 필드접근

		anonymous.method01();// 로컬변수에 접근

		anonymous.method02(new RemoConEx() {// 매개변수로 넘기면서 재정의 하는것이다
			// 이 메인클래스에서 재정의 하고 싶은 경우에 사용합니다.
			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is set On");
			}

			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is set Off");
			}
		});
	}
}
//set off를 어떻게 하는걸까.....