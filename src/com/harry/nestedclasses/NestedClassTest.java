package com.harry.nestedclasses;

import com.harry.nestedclasses.OutClass.StaticClass01;

public class NestedClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01();
		// �ν��Ͻ� ���Ŭ�����̹Ƿ� .���� �����ϰ� new�� �����մϴ�.(������ ���� Ŭ������°��� ǥ�� ������ϱ� �����Դϴ�.)
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
