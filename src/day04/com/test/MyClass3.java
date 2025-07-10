package day04.com.test;
public class MyClass3 {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[5] = 30/0;
		} catch(ArithmeticException e) {
			System.out.println("Arithmetric Exception");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("End");
		}

	}
}
