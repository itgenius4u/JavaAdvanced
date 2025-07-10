package day04.com.test3;

class Test {}
public class MyClass5 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.hashCode());
		Test t2 = new Test();
		System.out.println(t2.hashCode());
		Test t3 = t2;
		System.out.println(t3.hashCode());
	}
}
