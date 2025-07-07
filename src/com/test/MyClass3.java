package com.test;

class Employee extends Object {
	String name;	
}
class Freelancer extends Employee {
	String name;
}
public class MyClass3 {
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.name = "세종대왕";
//		System.out.println(e.name);
//		Freelancer f = new Freelancer();
//		Freelancer f2 = (Freelancer)e;
		//Employee e2 = f;		
		String n = "강감찬";
		String n2 = "강감찬";
		String n3 = new String("강감찬");
		if(n == n3) {
			System.out.println("O.K");
		} else {
			System.out.println("Not");
		}	
	}
}



