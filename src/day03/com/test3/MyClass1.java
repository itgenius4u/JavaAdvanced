package day03.com.test3;

abstract class A {
	void aMethod() { System.out.println("aMethod"); }
	abstract void myMethod();
}
class B extends A {
	@Override
	void myMethod() {
		System.out.println("myMethod");
	}	
}
public class MyClass1 {
	public static void main(String[] args) {
		//A a = new A();
		A a = new B();
		a.aMethod();
		a.myMethod();
	}
}



