package day03.com.test4;
interface Database {
	void open();
	void close();
}
class Oracle implements Database {
	@Override
	public void open() {	 System.out.println("Oracle open");}
	@Override
	public void close() { System.out.println("MySql open");}
}
public class MyClass1 {
	void testMethod(Database db) {
		db.open();
	}
	public static void main(String[] args) {
		Database db = new Oracle();
		db.open();
		db.close();
		
	}
}
