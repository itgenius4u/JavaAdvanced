package day04.com.test3;

interface Database {
	void open();
}
public class MyClass1 {
	public static void main(String[] args) {
		Database mysql = new Database() {
			public void open() {
				System.out.println("MySql open");
			}
		};
		mysql.open();
//		Database db = () -> {}; 
	}
}
