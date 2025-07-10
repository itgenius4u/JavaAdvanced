package day04.com.test3;
// Generics, 제네릭 <>
//class MyData {
//	private int m;
//	public int getM() { return this.m; }
//}
//class MyData2 {
//	private String m;
//	public String getM() { return this.m; }
//}
//class MyData {
//	private Object m;
//	public Object getM() { return this.m; }
//}
class MyData<T> {
	private T m;
	public T getM() { return this.m; }
}
public class MyClass2 {
	public static void main(String[] args) {
		MyData<Integer> m = new MyData<>();
		m.getM();
		MyData<String> m2 = new MyData<String>();
		m2.getM();

	}
}
