package day03.com.test2;

class DbManager {
	public static Database CreateDatabase(String dbName) {
		Database db = null;
		switch(dbName) {
			case "Oracle":
				db = new Oracle();
				break;
			case "MySql":
				db = new MySql();
				break;
		}
		return db;
	}
}

public class App {
	public static void main(String[] args) {
		Database db = DbManager.CreateDatabase("Oracle");
		db.open();
//		MySql mysql = new MySql();
//		mysql.open();
//		Oracle oracle = new Oracle();
//		oracle.open();
//		Database db = new MySql();
//		db.open();
//		Database db2 = new Oracle();
//		db2.open();
	}
}
