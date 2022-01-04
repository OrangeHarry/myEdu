package com.harry.test;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class BookFieldStorage {
	private List<BookField> list = new Vector<>();
	private Scanner sc = new Scanner(System.in);
	private int counter;
	private String id1 = null , id2 = null;
	private String pw1 = null , pw2 = null;

	public void showmenu1() {
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.페이지 소개   |  2.로그인   |  3.종료");
			System.out.println("-------------------------------------------------");
			
			System.out.print("원하는 메뉴의 번호를 선택 하세요 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("*************************************************");
				System.out.println("이 곳은 당신이 감명깊게 읽었던 책들을 저장하는 페이지 입니다.");
				System.out.println("내 인생 최고의 책을 이 곳 한켠에 기록해주세요");
				System.out.println("이것 또한 하나의 귀중한 기록이 될거에요!!");
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("감사합니다. 안녕히 가십시오.");
				System.exit(0);
				return;
			}
		}
	}
	public void showmenu2() {
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.책 등록   |  2.책 목록보기   |  3.로그아웃   |  4.종료");
			System.out.println("-------------------------------------------------");

			System.out.print("원하는 메뉴의 번호를 선택 하세요 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				registrationBook();
				break;
			case 2:
				showBook();
				break;
			case 3:
				showmenu1();
				break;
			case 4:
				System.out.println("감사합니다. 안녕히 가십시오.");
				System.exit(0);
				return;
			}
		}
	}

	public void registrationBook() {

		try {
			BookField bf = new BookField();
			bf.setBookNum(++counter);

			System.out.print("책 이름 : ");
			bf.setBookName(sc.nextLine());

			System.out.print("책 작가 :");
			bf.setBookWirter(sc.nextLine());

			System.out.print("책 가격 :");
			bf.setPrice(Integer.parseInt(sc.nextLine()));

			list.add(bf);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("등록에러!! 다시 입력해주세요");
		}
	}

	public void showBook() {
		if(list.size() == 0) {
			System.out.println("아직 등록한 책이 없습니다. 나만의 책 기록을 만들어주세요 :)");
		}
		for (BookField bookfield : list) {
			System.out.println(bookfield.getBookNum() + "번 : " + bookfield.getBookName() + ",\t"
					+ bookfield.getBookWirter() + ",\t" + bookfield.getPrice());
		}
	}

	public void login() {

		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.로그인   | 2.회원가입   |  3나가기");
			System.out.println("-------------------------------------------------");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 1) {
				if (id1 == null && pw1 == null) {
					System.out.println("회원가입부터 진행해주세요.");
					continue;
				}
				System.out.print("아이디 > ");
				id2 =sc.nextLine();
				System.out.print("비밀번호 > ");
				pw2 = sc.nextLine();
				if(id1.equals(id2)&&pw1.equals(pw2)) {
					System.out.println("로그인 성공!! 환영합니다 ["+id1+"]님");
					showmenu2();
				}else {
					System.out.println("아이디 혹은 비밀번호가 맞지 않습니다. 다시 입력해주세요");
				}
			}else if(num == 2) {
				if(id1 != null && pw1 !=null) {
					System.out.println("이미 가입된 아이디가 있습니다. 로그인을 진행해주세요");
					continue;
				}
				System.out.print("아이디 > ");
				id1 =sc.nextLine();
				System.out.print("비밀번호 > ");
				pw1 = sc.nextLine();
				System.out.println("회원가입 성공!!");
			}else if(num == 3) {
				System.out.println("로그인페이지를 취소합니다.");
				break;
			}
		}
	}
}

//	public void findBook() {
//		System.out.print("찾고싶은 책을 제목으로 검색해주세요 > ");
////		System.out.println(bf.getBookName());
//		for (BoardField bf : list) {
//			bf.getBookName();
//		}
//		
//		String str = bf.getBookName();
//		System.out.println(str.contains(sc.nextLine()));

//		if(str.indexOf(sc.nextLine()) != -1){
//			System.out.println("목록에 있습니다.");
//		}else {
//			System.out.println("목록에 없습니다.");
//		}
//}
//}