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
class MyData<T> { // class 기준으로 적용하는 방법
	private T m;
	public T getM() { return this.m; }
}
class MyMapData<K, V> {}
public class MyClass2 {
	// method 기준으로 적용하는 방법
	static <T> T myValue(T e) {
		return e;
	}
	// <? extends >, <? super >, <?>
	public static void main(String[] args) {
		MyData<Integer> m = new MyData<>();
		m.getM();
		MyData<String> m2 = new MyData<String>();
		m2.getM();
		int a = 10;
		System.out.println(myValue(a));
	}
}
