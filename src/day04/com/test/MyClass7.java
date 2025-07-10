package day04.com.test;

public class MyClass7 {
	void m() throws ArithmeticException {
		//int d = 10/0;
		throw new ArithmeticException();	
	}
	void n() throws ArithmeticException {
		m();
	}
	void p() {
		try {
			n();
		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
	}
	public static void main(String[] args) {
		MyClass7 m = new MyClass7();
		m.p();

	}

}
