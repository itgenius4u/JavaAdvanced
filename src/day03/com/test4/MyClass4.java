package day03.com.test4;
interface A {
	void aMethod();
}
abstract class B implements A{
	public void aMethod() {}
	abstract void bMethod();
}
class C extends B {
	@Override
	void bMethod() {	}	
}
public class MyClass4 {
	public static void main(String[] args) {
		A a = new C();
		a.aMethod();		
	}

}
