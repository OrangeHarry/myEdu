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
			System.out.println("1.������ �Ұ�   |  2.�α���   |  3.����");
			System.out.println("-------------------------------------------------");
			
			System.out.print("���ϴ� �޴��� ��ȣ�� ���� �ϼ��� > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("*************************************************");
				System.out.println("�� ���� ����� ������ �о��� å���� �����ϴ� ������ �Դϴ�.");
				System.out.println("�� �λ� �ְ��� å�� �� �� ���ҿ� ������ּ���");
				System.out.println("�̰� ���� �ϳ��� ������ ����� �ɰſ���!!");
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("�����մϴ�. �ȳ��� ���ʽÿ�.");
				System.exit(0);
				return;
			}
		}
	}
	public void showmenu2() {
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.å ���   |  2.å ��Ϻ���   |  3.�α׾ƿ�   |  4.����");
			System.out.println("-------------------------------------------------");

			System.out.print("���ϴ� �޴��� ��ȣ�� ���� �ϼ��� > ");
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
				System.out.println("�����մϴ�. �ȳ��� ���ʽÿ�.");
				System.exit(0);
				return;
			}
		}
	}

	public void registrationBook() {

		try {
			BookField bf = new BookField();
			bf.setBookNum(++counter);

			System.out.print("å �̸� : ");
			bf.setBookName(sc.nextLine());

			System.out.print("å �۰� :");
			bf.setBookWirter(sc.nextLine());

			System.out.print("å ���� :");
			bf.setPrice(Integer.parseInt(sc.nextLine()));

			list.add(bf);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��Ͽ���!! �ٽ� �Է����ּ���");
		}
	}

	public void showBook() {
		if(list.size() == 0) {
			System.out.println("���� ����� å�� �����ϴ�. ������ å ����� ������ּ��� :)");
		}
		for (BookField bookfield : list) {
			System.out.println(bookfield.getBookNum() + "�� : " + bookfield.getBookName() + ",\t"
					+ bookfield.getBookWirter() + ",\t" + bookfield.getPrice());
		}
	}

	public void login() {

		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.�α���   | 2.ȸ������   |  3������");
			System.out.println("-------------------------------------------------");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 1) {
				if (id1 == null && pw1 == null) {
					System.out.println("ȸ�����Ժ��� �������ּ���.");
					continue;
				}
				System.out.print("���̵� > ");
				id2 =sc.nextLine();
				System.out.print("��й�ȣ > ");
				pw2 = sc.nextLine();
				if(id1.equals(id2)&&pw1.equals(pw2)) {
					System.out.println("�α��� ����!! ȯ���մϴ� ["+id1+"]��");
					showmenu2();
				}else {
					System.out.println("���̵� Ȥ�� ��й�ȣ�� ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				}
			}else if(num == 2) {
				if(id1 != null && pw1 !=null) {
					System.out.println("�̹� ���Ե� ���̵� �ֽ��ϴ�. �α����� �������ּ���");
					continue;
				}
				System.out.print("���̵� > ");
				id1 =sc.nextLine();
				System.out.print("��й�ȣ > ");
				pw1 = sc.nextLine();
				System.out.println("ȸ������ ����!!");
			}else if(num == 3) {
				System.out.println("�α����������� ����մϴ�.");
				break;
			}
		}
	}
}

//	public void findBook() {
//		System.out.print("ã����� å�� �������� �˻����ּ��� > ");
////		System.out.println(bf.getBookName());
//		for (BoardField bf : list) {
//			bf.getBookName();
//		}
//		
//		String str = bf.getBookName();
//		System.out.println(str.contains(sc.nextLine()));

//		if(str.indexOf(sc.nextLine()) != -1){
//			System.out.println("��Ͽ� �ֽ��ϴ�.");
//		}else {
//			System.out.println("��Ͽ� �����ϴ�.");
//		}
//}
//}