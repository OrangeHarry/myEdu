package com.harry.classes;

public class DrawUtilTest {
	public static void main(String[] args) {
		DrawUtil.getInstance();// 1ȸ ����
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance();// ������ instance ����

		DrawUtil.getInstance();// �ٽû���
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance();// ����� ������ ���ҽ� ��ȯ �� ���ֱ�
	}
}
