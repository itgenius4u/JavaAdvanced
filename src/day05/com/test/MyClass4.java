package day05.com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClass4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
				
		Map<Integer, String> map = 
				new HashMap<Integer, String>();
		map.put(1, "연개소문");
		map.put(2, "이순신");
		map.put(3, "을지문덕"); // Map.Entry
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + ", " + 
					m.getValue());
		}
		
		
		
		
	}
}
