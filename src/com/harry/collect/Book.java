package com.harry.collect;

public class Book {
	private String title;
	private String writer;

	public Book(String title, String writer) {// �ʵ� ������
		super();
		this.title = title;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
