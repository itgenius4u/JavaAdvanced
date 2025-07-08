package day02.com.test2;
class Calculator {
	public int add(int a, int b) { // int a = 10, int b = 20
		int c = a + b;
		return c;
	}
	public static int add2(int a, int b) { // int a = 10, int b = 20
		int c = a + b;
		return c;
	}
	public int addArr(int[] arr) { // int[] arr = {1, 2, 3, 4}
		int sum = 0;
		for(int a : arr) {
			sum+=a;
		}
		return sum;
	}
}
class MyData {
	public int a;
}
public class MyClass1 {
	static void setValue(int a) { // int a = 0
		a++;
	}
	static void setValue2(MyData m) { // MyData m = m
		m.a++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator calc = new Calculator();
//		int ret = calc.add(10, 20);		
//		Calculator.add2(30, 40);		
		int a = 0; 
		setValue(a); // Call By Value
		System.out.println(a);
		MyData m = new MyData();
		setValue2(m); // Call By Reference
		System.out.println(m.a);
	}
}




