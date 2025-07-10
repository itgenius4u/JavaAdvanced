package day04.com.test;
public class MyClass9 {
	// 432
	private int data = 10;
	class Inner {
		void msg() {
			System.out.println(data);
		}
	}	
	static class Inner2 {}	
	void method() {
		class Inner3 {
			
		};
	}	
	public static void main(String[] args) {
		MyClass9 m = new MyClass9();
		MyClass9.Inner in = m.new Inner();
		in.msg();
	}
}
