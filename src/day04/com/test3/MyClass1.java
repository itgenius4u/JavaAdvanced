package day04.com.test3;
// 457페이지 ...예제
interface Database {
	void open();
}
public class MyClass1 {
	static void testMethod(Database db) {}
	public static void main(String[] args) {
		Database mysql = new Database() {
			public void open() {
				System.out.println("MySql open");
			}
		};
		mysql.open();
//		Database db = () -> {}; 
//		testMethod(new Database() {
//			public void open() {
//				System.out.println("");
//			}
//		});
//		testMethod(() -> {});
	}
}
