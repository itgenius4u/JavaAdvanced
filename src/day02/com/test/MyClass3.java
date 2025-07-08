package day02.com.test;

public class MyClass3 { // String[] args = {"이순신", "세종대왕", "강감찬"};
	public static void main(String[] args) {
		if(args.length != 0) {
			for(String s : args) {
				System.out.println(s);
			}
		}
		System.out.println("OK");
	}
}
// java ... 
