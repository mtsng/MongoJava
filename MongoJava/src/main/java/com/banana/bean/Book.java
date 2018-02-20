package com.banana.bean;

import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Book {
	private String title;
	private String author;
	private double price;
	private int id;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
}
