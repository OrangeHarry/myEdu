package com.harry.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new MessageListener());// setter로 클래스 하위 인터페이스에 상세구현 객체를 설정해 준다!!
		button.onTouch();// 이제 호출하면 상세 구현된 부분이 수행된다.

		System.out.println("===========================================");
		button.setOnClickListener(new PushListener());
		button.onTouch();
	}
}
//지금까지 한 작업을 정리하여 보도록 하겠습니다.
//클래스내에 있는 중첩 인터페이스 선언 -> 메소드 설계 -> 상세 구현 클래스 추가 및 구현 ->
//중첩 인터페이스와 구현 클래스를 서로 setter로 연결 -> 정상동작 확인