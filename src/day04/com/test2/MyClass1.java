package day04.com.test2;
class Database {
	void open() { System.out.println("Database open"); }
}
public class MyClass1 {
	public static void main(String[] args) {
		Database oracle = new Database() {
			@Override
			public void open() {
				System.out.println("Oracle open");
			}
		};
		oracle.open();		
	}
}
