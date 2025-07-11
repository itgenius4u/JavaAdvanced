package day05.com.test;

import java.util.ArrayList;
import java.util.List;

interface Database {
	void open();
	String select(String sql);
}
interface Oracle {
	String connect();
}
//@FunctionalInterface  
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
			public String connect() { return "Oracle";}
		};
		// Lambda Expression 
		Oracle oracle2 = () -> { 
			return "";
		};
		oracle2.connect();
		
		Calc c = (x, y) -> { return x + y;};
		c.add(10, 20);
		
		// 입력 -> 출력(o), 입력 -> 출력(x), 입력(x) -> 출력(o)..
		
		List<String> list = new ArrayList<>();
		list.add("이순신");
		list.add("세종대왕");
		for(int inx = 0; inx < list.size(); inx++) {
			System.out.println(list.get(inx));			
		}
		for(String s : list) {
			System.out.println(s);
		}
		list.forEach(
				(n) -> System.out.println(n)
				);
		
		// 2025.07.11
		// 2025-07-11 
		// 11/07/25
		// yyyy-mm-dd hh:mm:sss
	
	}
}





