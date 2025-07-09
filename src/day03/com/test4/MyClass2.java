package day03.com.test4;

// 캡슐화
class Student {
	//public String name;
	private String name;
	public String getName() { // getter
		return this.name;		
	}
	public void setName(String name) { // setter
		this.name = name;
	}
	public void studying()
	{
		System.out.println("학생 공부한다.");
	}
}
// 상속
class MidStudent extends Student {
	private int age;
	public void studying()
	{
		System.out.println("중학생 공부한다.");
	}
}
class Mid2Student extends Student {
	
}






public class MyClass2 {
	public static void main(String[] args) {

	}
}
