package com.test5;
class Database { void dbOpen() { System.out.println("Database Open");} }
class MySql extends Database {
	void dbOpen() { System.out.println("MySql Open");}
}
class Oracle extends Database {
	void dbOpen() { System.out.println("Oracle Open");}
}
public class MyApp {
	static Database CreateDatabase(String dbName) {
		Database db = null;
		switch(dbName) {
			case "MySql":
				db = new MySql();  // Database db = new MySql();
			break;
			case "Oracle":
				db = new Oracle(); // Database db = new Oracle();
			break;
		}
		return db;
	}
	public static void main(String[] args) {
		// MySql, Oracle
		 Database db = CreateDatabase("MySql");
		 db.dbOpen();
		 Database db2 = CreateDatabase("Oracle");
		 db2.dbOpen();
	}
}
