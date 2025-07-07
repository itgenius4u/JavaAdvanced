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
		
		// Object
		// Student
		// MidStudent
		// HighStudent
		Object o = new Student();
		Object o2 = new MidStudent();
		Object o3 = new HighStudent();
		HighStudent h = new HighStudent();
		MidStudent m = new MidStudent();
		Student s = h; // implicit cast
		Student s2 = m; // ...		
	}
	void getData(Object o) {
		String className = o.getClass().getName();
		switch(className) {
			case "Student":
				break;
		}		
	}
	void getData2(Student stu) {}
	void getData3(MidStudent stu) {}
	void getData4(HighStudent stu) {}
	
}





