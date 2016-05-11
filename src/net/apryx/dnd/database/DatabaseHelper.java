package net.apryx.dnd.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {
	
	private String database;
	private Connection connection;
	
	public DatabaseHelper(String dbFile){
		this.database = dbFile;
		createConnection();
	}
	
	public String getDatabase() {
		return database;
	}
	
	private void createConnection(){
		connection = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:"+database);
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
	
}
