package day05.com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
public class MyClass2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		SimpleDateFormat sm = 
				new SimpleDateFormat("yyyy-MM-dd");
		String dateFormat = sm.format(now);
		System.out.println(dateFormat);
		SimpleDateFormat sm2 = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormat2 = sm2.format(now);
		System.out.println(dateFormat2);
	}
}
