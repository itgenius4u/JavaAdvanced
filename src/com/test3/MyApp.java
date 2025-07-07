package com.test3;

public class MyApp {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("홍길동");
		student1.setAge(20);
		student1.studying();		
		
		Student student2 = new Student();
		student2.setName("이순신");
		student2.setAge(30);
		student2.studying();
		
		Student student3 = new Student("을지문덕", 40);
		student3.studying();
		
		MidStudent midstudent1 = new MidStudent();
		midstudent1.setName("세종대왕");
		midstudent1.setAge(40);
		midstudent1.studying();
		midstudent1.gotoschool();		
	}
}
