package day05.com.test;
interface Database {
	void open();
	String select(String sql);
}
interface Oracle {
	String connect();
}
interface Calc {
	int add(int a, int b);
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
		Oracle oracle = new Oracle() {
			public void connect() {}
		};
		// Lambda Expression 
		Oracle oracle2 = () -> { 
			return "";
		};
		oracle2.connect();
		
	}
}





