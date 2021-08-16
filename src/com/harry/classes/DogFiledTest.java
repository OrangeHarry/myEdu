package com.harry.classes;

public class DogFiledTest {
	public static void main(String[] args) {
		Dog dog = new Dog();// new 키로 델리게이션 메모리에 객체 생성. 참조가능.
		System.out.println("dog.name value is [" + dog.name + "]");
		System.out.println("dog.gender value is [" + dog.gender + "]");
		System.out.println("dog.age value is [" + dog.age + "]");
		System.out.println("dog.kind value is [" + dog.kind + "]");
		System.out.println("dog.character value is [" + dog.character + "]");
	}
}
