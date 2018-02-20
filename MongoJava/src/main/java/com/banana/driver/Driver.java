package com.banana.driver;

import com.banana.bean.Book;
import com.banana.util.MongoUtil;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Driver {
	
	public static void main(String[] args) {
		Book book = new Book("Mongo", "Jon");
		MongoClient mongoClient = MongoUtil.getConnection();
		
		DB database = mongoClient.getDB("Examples");
		DBCollection collection = database.getCollection("books");
		
		//collection.insert(BookAdapter.toDBObject(book));
		find(collection);
		MongoUtil.closeMongo(mongoClient);
	}
	
	public static void find(DBCollection collection) {
		DBObject query = new BasicDBObject("title", "Mongo");
		DBCursor cursor = collection.find(query);
		
		System.out.println(cursor);
	}
}
