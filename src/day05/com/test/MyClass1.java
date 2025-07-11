package day05.com.test;
interface Database {
	void open();
	String select(String sql);
}
public class MyClass1 {
	public static void main(String[] args) {
		Database d = new Database() {
			public void open() {}
			public String select(String sql) {
				return "";
			}			
		};	
		d.open();
		d.select("SELECT...");
	}
}
