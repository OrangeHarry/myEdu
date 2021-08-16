package com.harry.exception;

public class ThrowsClass {
//	public static void findClass() throws ClassNotFoundException {
//		Class class1 = Class.forName("java.lang.StringTwo");// 이런메소드가 없기 때문에 ClassNotFoundException 발생합니다.
//		// 여기서 Try Catch를 하지 않고 이 메소드를 호출 하는 부분에서 Try catch 하도록 할 때 씁니다.
//	}
	public void findClass() {
		try {
			Class class1 = Class.forName("java.lang.StringTwo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 이런 메소드가 없기 때문에 ClassNotFoundException 발생합니다.
		//여기서 Try Catch를 하지 않고 이 메소드를 호출 하는 부분에서 Try catch 하도록 할 때 씁니다.
	}
}
