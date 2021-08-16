package com.harry.nestedinterface;

public class Button {
	OnClickListener clickListener;// 아래만든 인터페이스를 필드에 선언!!

//	public OnClickListener getOnClickListener() {
//		return onClickListener;
//	} getter는 지워버려~ 우리는 setter만 쓴다!!

	public void setOnClickListener(OnClickListener clickListener) {// setter자동완성으로 추가
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}

	void onTouch() {
		clickListener.onClick();
		// interface와 imple이 연결되어 있으므로 호출이가능하다
	}

	interface OnClickListener {
		void onClick();
	}
}
//중첩 인터페이스는 interface가 클래스 안에 선언된 형태를 말합니다.