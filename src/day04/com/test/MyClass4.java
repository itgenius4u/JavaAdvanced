package day04.com.test;
public class MyClass4 {
	public static void main(String[] args) {
		try {
			try {
				int b = 10/0;
			} catch(ArithmeticException e) {}
			
			try { 
				int[] a = new int[5];
				a[5]=4;
			} catch(ArrayIndexOutOfBoundsException e) {}
		} catch(Exception e) {}
	}
}
