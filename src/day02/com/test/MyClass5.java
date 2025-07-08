package day02.com.test;
class Employee{
	public int empNo; // 0
	public Employee() {
//		System.out.println("Default Employee Constructor");
		this.empNo = 1000;
	}
	public int getEmpNo() { return this.empNo; }
}
public class MyClass5 {
//	static void myMethod() {}
	public static void main(String[] args) {
//		MyClass5 m = new MyClass5();
//		m.myMethod();
//		myMethod();
		Employee e = new Employee();
		int ret = e.getEmpNo();
		System.out.println(ret);
	}
}
