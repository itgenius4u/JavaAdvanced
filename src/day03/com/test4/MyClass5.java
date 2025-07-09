package day03.com.test4;

public class MyClass5 {
	public static void main(String[] args) {
//		try {
//			int a = 10/0;
//		} catch(ArithmeticException ex) { 
////			ArithmeticException ex = new ArithmeticException();
//			System.out.println(ex.getMessage());
//		}
		try {
//			String s = null;
//			s.toString();
//			int a = 10/0;
			throw new NullPointerException();
		} catch(NullPointerException ex) {
			System.out.println("관리자에게 연락주세요.");
		} catch(Exception ex) {
			System.out.println("예외상황입니다.");
		} finally {
			System.out.println("안녕히 가세요.");
		}
	}
}




