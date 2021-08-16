package com.harry.nestedclasses;

public class OutClassExtend {

	OutClassExtend() {
		System.out.println("OutClassExtend is Constructor");
	}

	void OutClassExtendMethod() {// 메소드
		// 로컬클래스
		class LocalClass {
			int lid = 0;

			void LocalClass() {// void 생략가능!!
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
//로컬 클래스의 경우 메소드가 호출 될 때만 수행됩니다.
//외부에서 접근을 할 수 없고, 접근자를 사용 할 수 없습니다.
//이 로컬클래스는 외부에서 변경 할 수 없다는 점을 확인 해 두셔야 합니다