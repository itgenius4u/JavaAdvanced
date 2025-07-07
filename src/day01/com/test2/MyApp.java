package day01.com.test2;

public class MyApp {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		int ret = MyApp.add(1, 2);
		System.out.println(ret);
		Calculator c = 
				new Calculator();
		System.out.println(
				c.divide(20, 2));
		
	}
}
