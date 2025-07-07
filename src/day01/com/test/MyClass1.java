package day01.com.test;

class Student { // public, default
	String name; // public, private, protected, default
}

public class MyClass1 {
	
	public static void main(String[] args) {
		int a = 10; // 값타입 
		int b = a; // 복사
		int c = b; 
		System.out.println(a);
		Student stu = new Student();
		stu.name = "이순신";
		Student stu2 = stu;
		Student stu3 = stu2;
		System.out.println(stu3.name);
		
	}
}
