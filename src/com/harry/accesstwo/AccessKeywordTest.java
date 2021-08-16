package com.harry.accesstwo;

import com.harry.access.AccessKeyword;

public class AccessKeywordTest {
	public static void main(String[] args) {
		AccessKeyword accessKeyword = new AccessKeyword();
		accessKeyword.sample01 = 0;
//		accessKeyword.sample02 = 0; // default 다른 패키지라서 접근불가능
//		accessKeyword.sample03 = 0;

		System.out.println("accessKeyword.sample01 value is [" + accessKeyword.sample01 + "]");
//		System.out.println("accessKeyword.sample02 value is [" + accessKeyword.sample02 + "]");
//		System.out.printnl("accessKeyword sample03 value is [" + accessKeyword.sample03 + "]");

		accessKeyword.run01();
//		accessKeyword.run02();
//		accessKeyword.run03();
	}
}
