package com.harry.interfacetest;

public class AnonymouseTest {//�͸� ���� ��ü
	public static void main(String[]args) {
		Remocon remocon = new Remocon() {//�������̽��� ���� = new �������̽�
			
			@Override
			public void setOn() {//�������̽��� ���ǵ� �߻�޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("----setOn Anonymouse----");
			}
			
			@Override
			public void setOff() {//�������̽��� ���ǵ� �߻� �޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("----setOff Anonymouse----");
			}
		}; //;�� ������ ����!!!(�� �ڵ��ϼ�������~~)
		remocon.setOn();
		remocon.setOff();
	}
}

//�������̽��� �߻�޼ҵ�� �� �־���ϳ�??