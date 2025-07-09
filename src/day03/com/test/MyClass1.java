package day03.com.test;
// 객체 -> 현실세계... 학생 -> 이름, 공부한다.
class Student {
	public Student() { 
		this.name = "이순신";
		System.out.println("Student Default Constructor");
	}
	public Student(String name) {
//		this();
		this.name = name; 
	}
	// 필드, 특징
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 메소드(동작)
	public void studying() {
		System.out.println(this.name + "는 공부한다.");
	}
	public void studying(String msg) {
		System.out.println(this.name + msg);
	}	 
	public static int score;
	public static int getScore() {
		return score;
	}
	public void gotoschool() {
		System.out.println("학생이 학교에 간다.");
	}
}
class MidStudent extends Student {
	public MidStudent() {
		super("세종대왕");
		System.out.println("MidStudent default Constructor");
	}
	private String address;
	public String getAddress() {
		return this.address;
	}
	public void eating() {
		System.out.println("중학생이 밥을 먹다.");
	}
	public void gotoschool() {
		System.out.println("중학생이 학교에 간다.");
	}
}
public class MyClass1 {
	public static void main(String[] args) {
		Student stu = new Student();
		Student stu2 = new Student("세종대왕");
		MidStudent stu3 = new MidStudent();		
		stu.studying();
		stu3.studying();
		stu.gotoschool();
		stu3.gotoschool();
		Student stu4 = new MidStudent();
		stu4.gotoschool(); 
		Object stu5 = new MidStudent();
		((MidStudent)stu5).gotoschool();
		
		
	}
}
