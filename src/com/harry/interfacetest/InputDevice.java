package com.harry.interfacetest;

public interface InputDevice extends PhysicalButton, ScreenTouch, EarPhoneSocket{
	abstract void alertError();
}
