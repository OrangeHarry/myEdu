package com.harry.classes;

public class ConnectUtilTest {
	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm();//������ �޼ҵ�ȣ���� �ѹ��� �� �� �ִ�.
		ConnectUtil.getInstance().releaseInstance();//�پ��� ���� �ڿ��������ش�
		ConnectUtil.getInstance().connectBank();//�ڿ����簡 �Ǿ����Ƿ� ���� �����ϰ� ȣ���Ѵ�
		ConnectUtil.getInstance().releaseInstance();
	}
}
