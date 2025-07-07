package day01.com.test4;

class A {
	void aMethod() { System.out.println("aMethod on A"); } 
}
class B extends A {
	void aMethod() { System.out.println("aMethod on B"); }
}
class C extends A {
	void aMethod() { System.out.println("aMethod on C"); }
}
public class MyClass1 {
	static void callMethod(A a) { a.aMethod(); }
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();			
		A a = new B();
		a.aMethod();
		callMethod(new B()); // A a = new B();
		callMethod(new C()); // A a = new C();
		// 다형성
		A[] arr = { new A(), new B(), new C()};
		for(A ar : arr) {
			ar.aMethod();
		}
	}
}
