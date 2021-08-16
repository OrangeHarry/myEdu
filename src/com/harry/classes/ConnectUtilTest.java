package com.harry.classes;

public class ConnectUtilTest {
	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm();//생성과 메소드호출을 한번에 할 수 있다.
		ConnectUtil.getInstance().releaseInstance();//다쓰고 나면 자원해제해준다
		ConnectUtil.getInstance().connectBank();//자원해재가 되었으므로 새로 생성하고 호출한다
		ConnectUtil.getInstance().releaseInstance();
	}
}
