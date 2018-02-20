package com.banana.util;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoUtil {
	private static MongoClient mongoClient = null;
	
	private static MongoClient createConnection() {
		
		try {
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mongoClient;
	}
	
	public static MongoClient getConnection() {
		
		if(mongoClient == null) {
			mongoClient = createConnection();
		}
		
		return mongoClient;
	}
	
	public static void closeMongo(MongoClient mc) {
		mc.close();
	}
}
