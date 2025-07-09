package day03.com.test4;
// 표준 명세서
interface Calculator {
	int calculate(int a, int b);
}
class Add implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a + b;
	} // 덧셈	
}
class Multiply implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a * b;
	} // 곱셈	
}
class Divide implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a/b;
	}	
}
class Calc {
	Calculator c;
	public Calc(Calculator c) { 		
		this.c = c;
	}
	public int calculate(int x, int y) {
		return c.calculate(x, y);
	}
}
public class MyClass3 {
	public static void main(String[] args) {
		Calc calc = new Calc(new Divide());
		calc.calculate(10, 20);
	}
}
