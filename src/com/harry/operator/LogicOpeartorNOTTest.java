package com.harry.operator;

public class LogicOpeartorNOTTest {
	public static void main(String[] args) {
		boolean isOnNotebook = true;

		if (!isOnNotebook) {// ��Ʈ���� isOn�� �ƴ�..�����ִٸ�..code������ ���� ����
			System.out.println("Notebook is off");
		} else {
			System.out.println("Notebook is on");
		}
		// ���� if (!isOnNotebook)�� �Ʒ��� ���� Ǯ�� �� �� �ֽ��ϴ�. ���� �ǹ� �Դϴ�.
		if (isOnNotebook == false) {
			System.out.println("NotebookEx is Off");
		} else {
			System.out.println("NotebookEx is ON");
		}

		///////////////////////////////////////////////////////
		if (isOnNotebook) {
			System.out.println("Notebook 03 is ON");
		} else {
			System.out.println("Notebook 03 is Off");
		}

		// ���� if (isOnNotebook)�� �Ʒ��� ���� Ǯ�� �� �� �ֽ��ϴ�. ���� �ǹ� �Դϴ�.
		if (isOnNotebook == true) {
			System.out.println("Notebook 04 is ON");
		} else {
			System.out.println("Notebook 04 is Off");

		}
	}
}
