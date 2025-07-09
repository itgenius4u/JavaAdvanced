package day03.com.test3;

abstract class Database {
	abstract void open();
	void close() { System.out.println("close"); }
}
class Oracle extends Database {
	void open() { System.out.println("Oracle open"); }
}
class MySql extends Database {
	void open() { System.out.println("MySql open"); }
}
public class MyClass2 {
	public static void main(String[] args) {
		Database db = new Oracle();
		db.open();	
		Database db2 = new MySql();
		db2.open();
	}

}
