package com.harry.nestedclasses;

public class OutClass {

	OutClass() {// 이거 생성자냐
		System.out.println("OutClasses is COnstructor");
	}

	// 인스턴스 멤버 클래스입니다.
	class NestedClass01 {
		int nId = 0;// 필드

		NestedClass01() { // 생성자
			System.out.println("NestedClass01 Constructor");
		}

		void nestedClass01Method() { // 메소드
			System.out.println("NestedClass01 id value is " + this.nId);
			System.out.println("nestedClass01Method call....");
		}
	}

	// static 멤버 클래스
	static class StaticClass01 {
		int sId = 1;
		static int nameId = 100; // 필드

		StaticClass01() { // 생성자
			System.out.println("StaticClass01 Constructor");
		}

		void staticNestedClassMethod() {// 메소드
			System.out.println("staticNestedClassMethod sId value is " + sId);
			System.out.println("staticNestedClassMethod call...");
		}

		static void staticNestedClassStaticMethod() {
			System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
			System.out.println("staticNestedClassStaticMethod call....");
		}
	}

//	class NestedClassTwo {//내 실습용 일반 인스턴스에서는 static사용불가
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
