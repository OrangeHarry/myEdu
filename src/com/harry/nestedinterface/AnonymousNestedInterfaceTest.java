package com.harry.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn();// �ʵ�����
		anonymous.fieldRemoConEx.setOff();// �ʵ�����

		anonymous.method01();// ���ú����� ����

		anonymous.method02(new RemoConEx() {// �Ű������� �ѱ�鼭 ������ �ϴ°��̴�
			// �� ����Ŭ�������� ������ �ϰ� ���� ��쿡 ����մϴ�.
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
//set off�� ��� �ϴ°ɱ�.....