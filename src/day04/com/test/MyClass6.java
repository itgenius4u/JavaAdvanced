package day04.com.test;
// main -> p() -> n() -> m()
public class MyClass6 {
	void m() {
		//int d = 10/0;
		throw new ArithmeticException();	
	}
	void n() {
		m();
	}
	void p() {
		n();
	}
	public static void main(String[] args) {
		MyClass6 m = new MyClass6();
		m.p();

	}

}
