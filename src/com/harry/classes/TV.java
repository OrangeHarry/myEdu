package com.harry.classes;

public class TV {
	String company = "";
	String madeDay = "";
	String name = "";
	String color = "";

	public TV() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Tv default constructor is call");

	}

	public TV(String company) {
		super();
		this.company = company;
		System.out.println("TV constructor param1 is call.");
	}

	public TV(String company, String madeDay) {
		super();
		this.company = company;
		this.madeDay = madeDay;
		System.out.println("TV constructor param2 is call.");
	}

	public TV(String company, String madeDay, String name) {
		super();
		this.company = company;
		this.madeDay = madeDay;
		this.name = name;
		System.out.println("TV constructor param3 is call.");
	}

	public TV(String company, String madeDay, String name, String color) {
		super();
		this.company = company;
		this.madeDay = madeDay;
		this.name = name;
		this.color = color;
		System.out.println("TV constructor param4 is call.");
	}
}
