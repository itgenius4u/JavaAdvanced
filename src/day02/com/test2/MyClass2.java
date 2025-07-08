package day02.com.test2;

class A {
	static { System.out.println("A static"); }
	public A() { System.out.println("A default Constrcutor"); }
}
class B extends A {
	static { System.out.println("B static"); }
	public B() { System.out.println("B default Constructor"); }
}
public class MyClass2 {
	public static void main(String[] args) {
		B b = new B();
	}
}
