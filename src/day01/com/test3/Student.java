package day01.com.test3;

public class Student {
	public Student() {} // Default Constructor
	public Student(String name, int age) { // Constructor Overloading
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void studying() {
		System.out.println(this.name + "은 공부를 한다.");
	}
}
