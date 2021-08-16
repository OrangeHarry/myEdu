package com.harry.exception;

public class CustomExceptionTest {
	public static void main(String[] args) throws CustomException {
		CustomCalcul customCalcul = new CustomCalcul();
//		customCalcul.compareXY(10, 20);
		customCalcul.compareXY(1, 2);
	}
}
