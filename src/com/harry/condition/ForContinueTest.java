package com.harry.condition;

public class ForContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {//�������� ����. 2�� ������ ��������. ¦��
				continue; //¦���� �Ʒ��� �̵����� �ʰ� �ٽ� ���ǹ��� Ÿ�� ��ӵȴٴ� ��.
			}
			System.out.println(i);
		}
	}
}
