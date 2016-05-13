package net.apryx.dnd.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {
	
	private String database;
	private Connection connection;
	
	public DatabaseHelper(String dbFile){
		this.database = dbFile;
		createConnection();
	}
	
	public void createTables(){
		if(!checkConnection()){
			System.err.println("Error Creating Connection");
			return;
		}
		
		Statement statement = null;
		try{
			statement = connection.createStatement();

			statement.execute("DROP TABLE IF EXISTS Item");
			statement.execute("DROP TABLE IF EXISTS Weapon");
			statement.execute("DROP TABLE IF EXISTS Armor");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(statement != null)
				try{statement.close();}catch(Exception e){e.printStackTrace();}
		}
		
	}
	
	public String getDatabase() {
		return database;
	}
	
	private boolean checkConnection(){
		if(connection == null){
			createConnection();
			return true;
		}else{
			try {
				if(connection.isClosed()){
					createConnection();
				}
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
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
