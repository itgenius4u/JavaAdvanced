package day05.com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MyClass3 {
	public static void main(String[] args) {
		List<String> list = new Vector();
		list.add("이순신");
		list.add("세종대왕");
		List<String> list2 = new LinkedList<String>();
		list.add("강감찬");
		list.add("을지문덕");
		
		HashSet<String> set = new HashSet<>(); 
		set.add("세종대왕");
		set.add("세종대왕");
		set.add("을지문덕");
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s : set) {
			System.out.println(s);
		}
		
	}
}
