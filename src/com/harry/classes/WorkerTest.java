package com.harry.classes;

public class WorkerTest {
	public static void main(String[] args) {
		System.out.println("---Objet New--Start--");
		Worker worker = new Worker();// 이렇게 new로 생성하면 객체가 생성된 것이다
										// 생성 후 worker라는 변수에 담아두었다
		Worker workerTwo = new Worker();// 두번째 객체를 만듬
		System.out.println("worker와 wokerTwo는 서로 각기 다른 객체입니다.");

		System.out.println("------Object New----end-----");

	}
}
