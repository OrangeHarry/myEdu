package com.harry.datatype;

public class BooleanTest {
	public static void main(String[] args) {
		boolean isStudent = false;

		if (isStudent) {
			System.out.println("�л��Դϴ�.");
		} else {
			System.out.println("�л��̾ƴմϴ�.");
		}
	}
}
//byte : 1byte, 8bit -> �⺻ �ּ� ���� ����
//char : 2byte, 16bit -> �����ڵ�, �ѱ� �ϼ��� (����)
//int : 4byte, 32bit -> ���� ���� ��� (����)
//long : 8byte, 64bit -> ������ �����, ��̿� ��ҹ��� 'L' (ū ����)
//float : 4byte, 32bit -> �������� �������Ͽ� ��̿� ��ҹ��� 'F' (�Ǽ�)
//double : 8byte, 64bit -> ���� ū �Ǽ�
//boolean: 1byte, 8bit -> ��������, (��, ����)

//byte(1) < short(2) < int(4) <long(8) < float(4) < double(8)