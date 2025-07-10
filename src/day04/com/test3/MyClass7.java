package day04.com.test3;

import java.util.ArrayList;
import java.util.List;

public class MyClass7 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(100);
		List<String> al2 = new ArrayList<>();
		al2.add("홍길동");
		al2.add("강감찬");
		String ret = al2.get(0);
//		List al3 = new ArrayList();
//		al3.add(10);
//		al3.add("홍길동");
		for(String o : al2) {
			System.out.println(o);
		}

	}

}
