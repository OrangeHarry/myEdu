package com.harry.nestedclasses;

public class OutClassExtend {

	OutClassExtend() {
		System.out.println("OutClassExtend is Constructor");
	}

	void OutClassExtendMethod() {// �޼ҵ�
		// ����Ŭ����
		class LocalClass {
			int lid = 0;

			void LocalClass() {// void ��������!!
				System.out.println("LocalClass is Constructor");
			}

			void localMethod() {
				System.out.println("LocalClass lid value is " + this.lid);
				System.out.println("localMethod is OK");
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.lid = 10;
		localClass.localMethod();
	}
}
//���� Ŭ������ ��� �޼ҵ尡 ȣ�� �� ���� ����˴ϴ�.
//�ܺο��� ������ �� �� ����, �����ڸ� ��� �� �� �����ϴ�.
//�� ����Ŭ������ �ܺο��� ���� �� �� ���ٴ� ���� Ȯ�� �� �μž� �մϴ�