package com.harry.nestedclasses;

import com.harry.nestedclasses.OutClass.StaticClass01;

public class NestedClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01();
		// 인스턴스 멤버클래스이므로 .으로 접근하고 new로 생성합니다.(이유는 안쪽 클래스라는것을 표시 해줘야하기 때문입니다.)
		nestedClass01.nId = 1;
		nestedClass01.nestedClass01Method();

		System.out.println("---------------------------------------");
		///////////////////////////////////////////
		OutClass.StaticClass01 staticClass01 = new OutClass.StaticClass01();
		staticClass01.sId = 2;
		staticClass01.staticNestedClassMethod();

		OutClass.StaticClass01.nameId = 90;
		OutClass.StaticClass01.staticNestedClassStaticMethod();

		System.out.println("=========================================");
		OutClass.NestedClassTwo nestedClassTwo = outClass.new NestedClassTwo();
		nestedClassTwo.nameID = 29;
		nestedClassTwo.nestedClassTwoMethod();
	}
}
