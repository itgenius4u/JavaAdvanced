package day04.com.test;
interface C {
	void cMethod();
	interface D {
		void dMethod();
	}
}
class A {
	private int aMember;
	interface Myinterface{
		void myMethod();
	}
}
class B implements A.Myinterface {
	@Override
	public void myMethod() {	}	
}

public class MyClass10 {
	public static void main(String[] args) {
		B b = new B();
		b.myMethod();
	}
}
