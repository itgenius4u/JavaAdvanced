package day01.com.test;

class School {}
public class MyClass7 {
	public static void main(String[] args) {
		School s = new School();
		School s2 = new School();
		if(s == s2) {
			System.out.println("O.K");
		} else {
			System.out.println("Not");
		}
		School s3 = s;
		if(s == s3) {
			System.out.println("O.K");
		} else {
			System.out.println("Not");
		}
		
//		School s4;
//		s4.toString();
		
		
	}
}
