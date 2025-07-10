package day04.com.test3;
class A extends Object {
	private int aMember;
	public void setAMember(int aMember) {
		this.aMember = aMember;
	}	
	@Override
	public String toString() {
		return "aMember: " + this.aMember;
	}
}
public class MyClass3 {
	public static void main(String[] args) {
		A a = new A();
		a.setAMember(1000);
		System.out.println(a.toString());
		System.out.println(a);
	}
}
