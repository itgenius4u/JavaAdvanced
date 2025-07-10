package day04.com.test;

public class MyClass5 {
	public static void main(String[] args) {
		//throw, throws
		//throw new ArithmeticException();
		//throw new ArrayIndexOutOfBoundsException();
		int age = 20;
		if(age < 18) {
			throw new ArithmeticException();
		}
		
	}
}
