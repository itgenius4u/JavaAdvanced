package day02.com.test3;

class A { // public, default
	public int i;
	private int j;
	protected int k;	 // default & protected
	public int getValueJ() {
		return j;
	}
	private int getValueK() {
		return k;
	}
}
class B extends A {	
	public int getValueI() {
		return i;
	}
	public int getValueJ() {
		return super.getValueJ();
	}
	
}
public class MyClass1 {
	public static void main(String[] args) {		
		B b = new B();
	
	}
}
