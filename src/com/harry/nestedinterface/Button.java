package com.harry.nestedinterface;

public class Button {
	OnClickListener clickListener;// �Ʒ����� �������̽��� �ʵ忡 ����!!

//	public OnClickListener getOnClickListener() {
//		return onClickListener;
//	} getter�� ��������~ �츮�� setter�� ����!!

	public void setOnClickListener(OnClickListener clickListener) {// setter�ڵ��ϼ����� �߰�
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}

	void onTouch() {
		clickListener.onClick();
		// interface�� imple�� ����Ǿ� �����Ƿ� ȣ���̰����ϴ�
	}

	interface OnClickListener {
		void onClick();
	}
}
//��ø �������̽��� interface�� Ŭ���� �ȿ� ����� ���¸� ���մϴ�.