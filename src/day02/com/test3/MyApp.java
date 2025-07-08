package day02.com.test3;

//abstract class Database {
//	void dbOpen() { System.out.println("Database open"); }
//}
//interface Database {
//	void dbOpen();
//}
class Database {
	void dbOpen() { System.out.println("Database open"); }
}
class Oracle extends Database {
	void dbOpen() { System.out.println("Oracle open"); }
	void sqlQuery() { System.out.println("Oracle query"); }
}
class MySql extends Database {
	void dbOpen() { System.out.println("Mysql open"); }
	void sqlQuery() { System.out.println("MySql query"); }
}
public class MyApp {
//	static void dbOpen1(Oracle oracle) {
//		oracle.dbOpen();
//	}
//	static void dbOpen2(MySql mysql) {
//		mysql.dbOpen();
//	}
//	static void dbOpen(Database db) {
//		db.dbOpen();
//	}
	public static void main(String[] args) {
//		Oracle oracle = new Oracle();
//		oracle.dbOpen();
//		MySql mysql = new MySql();
//		mysql.dbOpen();
		dbOpen(new Oracle());
		dbOpen(new MySql());
	}
}



