package com.harry.nestedclasses;

public class OutClass {

	OutClass() {// �̰� �����ڳ�
		System.out.println("OutClasses is COnstructor");
	}

	// �ν��Ͻ� ��� Ŭ�����Դϴ�.
	class NestedClass01 {
		int nId = 0;// �ʵ�

		NestedClass01() { // ������
			System.out.println("NestedClass01 Constructor");
		}

		void nestedClass01Method() { // �޼ҵ�
			System.out.println("NestedClass01 id value is " + this.nId);
			System.out.println("nestedClass01Method call....");
		}
	}

	// static ��� Ŭ����
	static class StaticClass01 {
		int sId = 1;
		static int nameId = 100; // �ʵ�

		StaticClass01() { // ������
			System.out.println("StaticClass01 Constructor");
		}

		void staticNestedClassMethod() {// �޼ҵ�
			System.out.println("staticNestedClassMethod sId value is " + sId);
			System.out.println("staticNestedClassMethod call...");
		}

		static void staticNestedClassStaticMethod() {
			System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
			System.out.println("staticNestedClassStaticMethod call....");
		}
	}

//	class NestedClassTwo {//�� �ǽ��� �Ϲ� �ν��Ͻ������� static���Ұ�
//		static int nameId = 0;
//		static void staicNestedClassTwoStaticMethod() {
//			System.out.println("staticNestedClassTwoStaticMethod call....");
//		}
//	}
	class NestedClassTwo {
		int nameID = 0;

		void nestedClassTwoMethod() {
			System.out.println("nestedClassTwoMethod nameID value is " + this.nameID);
			System.out.println("nestedClassTwoMethod called");
		}
	}
}
