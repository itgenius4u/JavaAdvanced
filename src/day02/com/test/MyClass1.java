package day02.com.test;

class MyData {
	private String data;
	public MyData() { this.data = "이순신";}
	public String getData() {
		return this.data;
	}
}
public class MyClass1 {
	public static void main(String[] args) {
		int a = 10;
		String s = "홍길동";
		MyData m = new MyData();		
		System.out.println(m.getData());
		MyData m2 = m;
		System.out.println(m2.getData());	
		String s2 = "홍길동";
		if(s == s2) {
			System.out.println("O.K");
		}
		String s3 = s2;
		if(s2 == s3) {
			System.out.println("O.K");
		}
		String s4 = new String("홍길동");
		if(s3 == s4) {
			System.out.println("O.K");
		}
		if(s3.equals(s4)) {
			System.out.println("O.K2");
		}
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
