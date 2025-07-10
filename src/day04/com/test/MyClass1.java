package day04.com.test;
// OOP 캡슐화, 상속성, 다형성
interface Database {
	static String connectStr = "";
	int a = 10;
//	default void disconnect() { System.out.println("disconnect"); }
	void open();
}
abstract class RDatabase {
	abstract void select();
	void close() { System.out.println("RDatabase close"); }
}
class Oracle extends RDatabase implements Database {
	@Override
	public void open() {	 System.out.println("Oracle open");}
	@Override
	void select() { System.out.println("Oracle select");	}	
}
public class MyClass1 {
	public static void main(String[] args) {
		Database db = new Oracle();	
		db.open();
		Oracle oracle = new Oracle();
		oracle.open();
		RDatabase rdatabase = new Oracle();
		rdatabase.close();
		rdatabase.select();
	}
}
