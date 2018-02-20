package com.banana.adapter;

import com.banana.bean.Book;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class BookAdapter {
	public static final DBObject toDBObject(Book book) {
		return new BasicDBObject("author", book.getAuthor())
                .append("title", book.getTitle());
	}
}
