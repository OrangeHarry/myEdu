package com.harry.exception;

public class CustomCalcul {
	public void compareXY(int x, int y) throws CustomException {// ���� ���ѱ�ϴ�.
		if (x + y > 10) {
			throw new CustomException("x+y>10");// ���ܸ� ���Ӱ� �߻���Ų��.
		} else {
			System.out.println("-------------Nothing------------");
		}
	}
}
