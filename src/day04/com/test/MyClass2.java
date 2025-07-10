package day04.com.test;

public class MyClass2 {
	public static void main(String[] args) {
		//int a = 10/0;
		try {
			String c = "a";
			int b = 	Integer.parseInt(c);
//			int a = 10/0;
			System.out.println(b);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
